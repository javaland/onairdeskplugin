package nl.caliope.onairdesk.provider;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import nl.caliope.onairdesk.AutomationController;
import nl.caliope.onairdesk.model.ScheduledItem;

public abstract class ScheduledItemProvider
{

	private AutomationController automationController;

	/**
	 * returns the playlist of the given date
	 * 
	 * @param date
	 * @return
	 * @throws IOException
	 */
	public abstract List<ScheduledItem> getScheduledItems(Date from,Date to) throws IOException;

	public AutomationController getAutomationController()
	{
		return automationController;
	}

	public void setAutomationController(AutomationController automationController)
	{
		this.automationController = automationController;
	}
}
