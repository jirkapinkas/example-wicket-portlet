package cz.jiripinkas.portlet.item;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

public class ItemPortlet extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return ListItemsPage.class;
	}

	@Override
	public void init() {
		super.init();
		addComponentInstantiationListener(new SpringComponentInjector(this));
	}

}
