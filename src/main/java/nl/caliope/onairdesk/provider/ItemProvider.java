package nl.caliope.onairdesk.provider;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import nl.caliope.onairdesk.AutomationController;
import nl.caliope.onairdesk.model.Item;

public abstract class ItemProvider
{
	private AutomationController automationController;

	public List<Item> getItems() throws IOException
	{
		return getItems(null);
	}

	/**
	 * returns all items that were added or modified after the given date
	 * 
	 * @param date
	 *            the date after wich the items should be added or modified, or
	 *            null to retrieve all items
	 * @return
	 * @throws IOException
	 */
	public abstract List<Item> getItems(Date date) throws IOException;

	public abstract Item getItem(String automationId) throws IOException;

	public abstract List<Integer> getIdList() throws IOException;

	public AutomationController getAutomationController()
	{
		return automationController;
	}

	public void setAutomationController(AutomationController automationController)
	{
		this.automationController = automationController;
	}
}
