package nl.caliope.onairdesk.provider;

import java.util.ArrayList;
import java.util.List;

import nl.caliope.onairdesk.AutomationController;
import nl.caliope.onairdesk.model.Item;

public abstract class NowPlayingProvider
{

	private List<NowPlayingListener> listeners = new ArrayList<NowPlayingListener>();
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

	public void fireNowPlayingChanged()
	{
		List<NowPlayingListener> listeners = new ArrayList<NowPlayingListener>(this.listeners);
		for (NowPlayingListener listener : listeners) {
			listener.nowPlayingChanged();
		}
	}

	public void addNowPlayingListener(NowPlayingListener listener)
	{
		this.listeners.add(listener);
	}

	public void removeNowPlayingListener(NowPlayingListener listener)
	{
		this.listeners.remove(listener);
	}
}
