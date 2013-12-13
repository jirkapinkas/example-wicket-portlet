package cz.jiripinkas.portlet.itemcount;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.spring.injection.annot.SpringBean;

import cz.jiripinkas.service.ItemService;

public class ListItemCountPage extends WebPage {

	@SpringBean
	private ItemService itemService;

	public ListItemCountPage() {
		int count = itemService.findAll().size();
		add(new Label("message", "Number of items in database: " + count));
	}
}
