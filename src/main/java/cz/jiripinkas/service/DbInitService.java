package cz.jiripinkas.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.jiripinkas.entity.Item;

@Service
@Transactional
public class DbInitService {

	@Autowired
	private ItemService itemService;

	@PostConstruct
	public void init() {
		System.out.println("*** START INIT DATABASE ***");
		{
			Item item = new Item();
			item.setName("Java in 21 days");
			item.setDescription("EBook");
			item.setPrice(500);
			itemService.save(item);
		}
		{
			Item item = new Item();
			item.setName("Java cup");
			item.setDescription("Coffee cup");
			item.setPrice(100);
			itemService.save(item);
		}
		{
			Item item = new Item();
			item.setName("Java t-shirt");
			item.setDescription("T-shirts for all Java programmers");
			item.setPrice(500);
			itemService.save(item);
		}
		{
			Item item = new Item();
			item.setName("Professional Java consulting");
			item.setDescription("per manhour");
			item.setPrice(800);
			itemService.save(item);
		}
		{
			Item item = new Item();
			item.setName("Professional Java training");
			item.setDescription("per manday");
			item.setPrice(800);
			itemService.save(item);
		}
		System.out.println("*** FINISH INIT DATABASE ***");
	}

}