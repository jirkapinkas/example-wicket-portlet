package cz.jiripinkas.portlet.item;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.spring.injection.annot.SpringBean;

import cz.jiripinkas.entity.Item;
import cz.jiripinkas.service.ItemService;

public class ItemForm extends Form<Item> {

	@SpringBean
	private ItemService itemService;

	private TextField nameField;
	private TextField descriptionField;
	private TextField priceField;

	public ItemForm(String id) {
		super(id);
		nameField = new TextField("name", Model.of(""));
		descriptionField = new TextField("description", Model.of(""));
		priceField = new TextField("price", Model.of("0"));

		add(nameField);
		add(descriptionField);
		add(priceField);
	}

	@Override
	protected void onSubmit() {
		Item item = new Item();
		item.setName(nameField.getDefaultModelObjectAsString());
		item.setDescription(descriptionField.getDefaultModelObjectAsString());
		item.setPrice(Double.parseDouble(priceField.getDefaultModelObjectAsString()));
		itemService.save(item);
		setResponsePage(ListItemsPage.class);
	}
}
