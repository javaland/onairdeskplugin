package nl.caliope.onairdesk.provider;

import java.io.IOException;
import java.util.List;

import nl.caliope.onairdesk.AutomationController;
import nl.caliope.onairdesk.model.Item;

public abstract class ItemProvider
{
	private AutomationController automationController;

	public abstract List<Item> getItems() throws IOException;

	public abstract Item getItem(String automationId) throws IOException;

	public AutomationController getAutomationController()
	{
		return automationController;
	}

	public void setAutomationController(AutomationController automationController)
	{
		this.automationController = automationController;
	}
}
