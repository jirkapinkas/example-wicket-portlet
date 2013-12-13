package cz.jiripinkas.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cz.jiripinkas.entity.OrderedItem;

@Repository
public class OrderedItemRepository {

        @PersistenceContext
        private EntityManager entityManager;

        public OrderedItem save(OrderedItem orderedItem) {
                if (orderedItem.getOrderedItemId() == 0) {
                        entityManager.persist(orderedItem);
                        return entityManager.find(OrderedItem.class,
                                        orderedItem.getOrderedItemId());
                } else {
                        return entityManager.merge(orderedItem);
                }
        }

        public OrderedItem findOne(int orderedItemId) {
                return entityManager.find(OrderedItem.class, orderedItemId);
        }

}