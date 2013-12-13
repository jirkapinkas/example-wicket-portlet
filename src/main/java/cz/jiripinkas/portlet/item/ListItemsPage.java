package cz.jiripinkas.portlet.item;

import org.apache.wicket.extensions.markup.html.repeater.data.table.DataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.HeadersToolbar;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.NavigationToolbar;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.repeater.data.EmptyDataProvider;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.model.Model;
import org.apache.wicket.spring.injection.annot.SpringBean;

import cz.jiripinkas.entity.Item;
import cz.jiripinkas.service.ItemService;

public class ListItemsPage extends WebPage {

	@SpringBean
	private ItemService itemService;

	public ListItemsPage() {
		final Label label = new Label("message", "items from database:");
		add(label);

		add(new Link("link") {

			@Override
			public void onClick() {
				setResponsePage(AddItemPage.class);
			}
		});
		
		ListDataProvider<Item> itemProvider = new ListDataProvider<Item>(itemService.findAll());

		IColumn[] columns = new IColumn[2];

		columns[0] = new PropertyColumn(new Model<String>("Name"), "name");
		columns[1] = new PropertyColumn(new Model<String>("Price"), "price");

		DataTable table = new DataTable("datatable", columns, itemProvider, 10);
		table.addBottomToolbar(new NavigationToolbar(table));
		table.addTopToolbar(new HeadersToolbar(table, null));
		add(table);

	}
}
