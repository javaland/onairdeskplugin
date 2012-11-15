package nl.caliope.onairdesk.provider;

import nl.caliope.onairdesk.AutomationController;
import nl.caliope.onairdesk.model.Item;

public abstract class NowPlayingProvider
{

	private AutomationController automationController;

	public abstract Item getPrevious(int n);

	public abstract Item getCurrent();

	public abstract Item getNext(int n);

	public abstract int getPreviousCount();

	public abstract int getNextCount();

	public AutomationController getAutomationController()
	{
		return automationController;
	}

	public void setAutomationController(AutomationController automationController)
	{
		this.automationController = automationController;
	}
}
