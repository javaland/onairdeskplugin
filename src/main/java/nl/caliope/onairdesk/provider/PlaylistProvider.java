package nl.caliope.onairdesk.provider;

import java.io.IOException;
import java.util.Date;

import nl.caliope.onairdesk.AutomationController;
import nl.caliope.onairdesk.model.Playlist;

public abstract class PlaylistProvider
{

	private AutomationController automationController;

	/**
	 * returns the playlist of the given date
	 * 
	 * @param date
	 * @return
	 * @throws IOException
	 */
	public abstract Playlist getPlaylist(Date date) throws IOException;

	public AutomationController getAutomationController()
	{
		return automationController;
	}

	public void setAutomationController(AutomationController automationController)
	{
		this.automationController = automationController;
	}
}
