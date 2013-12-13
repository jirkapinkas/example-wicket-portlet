package cz.jiripinkas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.jiripinkas.entity.OrderedItem;
import cz.jiripinkas.repository.OrderedItemRepository;

@Service
@Transactional
public class OrderedItemService {

        @Autowired
        private OrderedItemRepository orderedItemRepository;
        
        public OrderedItem save(OrderedItem orderedItem) {
                return orderedItemRepository.save(orderedItem);
        }

        public OrderedItem findOne(int orderedItemId) {
                return orderedItemRepository.findOne(orderedItemId);
        }


}