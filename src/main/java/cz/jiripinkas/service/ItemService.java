package cz.jiripinkas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.jiripinkas.entity.Item;
import cz.jiripinkas.repository.ItemRepository;

@Service
@Transactional
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public Item save(Item item) {
		return itemRepository.save(item);
	}

	public Item findOne(int itemId) {
		return itemRepository.findOne(itemId);
	}

	public List<Item> findAll() {
		return itemRepository.findAll();
	}

	public void remove(int itemId) {
		itemRepository.remove(itemId);
	}

}