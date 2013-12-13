package cz.jiripinkas.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cz.jiripinkas.entity.Item;

@Repository
public class ItemRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public Item save(Item item) {
		if (item.getItemId() == 0) {
			entityManager.persist(item);
			return entityManager.find(Item.class, item.getItemId());
		} else {
			return entityManager.merge(item);
		}
	}

	public Item findOne(int itemId) {
		return entityManager.find(Item.class, itemId);
	}

	public List<Item> findAll() {
		return entityManager.createNamedQuery(Item.FIND_ALL, Item.class)
				.getResultList();
	}

	public void remove(int itemId) {
		entityManager.remove(entityManager.find(Item.class, itemId));
	}

}