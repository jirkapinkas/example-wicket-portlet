package cz.jiripinkas.portlet.itemcount;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

public class ItemCountPortlet extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return ListItemCountPage.class;
	}

	@Override
	public void init() {
		super.init();
		addComponentInstantiationListener(new SpringComponentInjector(this));
	}

}
