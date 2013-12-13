package cz.jiripinkas.portlet.item;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class AddItemPage extends WebPage {

	public AddItemPage() {
		final Label label = new Label("message", "add new item:");
		add(label);

		add(new ItemForm("form"));
	}
}
