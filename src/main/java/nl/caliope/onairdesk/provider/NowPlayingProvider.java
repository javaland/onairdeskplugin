package nl.caliope.onairdesk.provider;

import java.util.Date;

import nl.caliope.onairdesk.AutomationController;
import nl.caliope.onairdesk.model.Item;

public abstract class NowPlayingProvider
{

	private AutomationController automationController;

	public abstract boolean hasChanged(Date from);

	public abstract Item getNowPlaying();

	public AutomationController getAutomationController()
	{
		return automationController;
	}

	public void setAutomationController(AutomationController automationController)
	{
		this.automationController = automationController;
	}
}
