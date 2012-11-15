package nl.caliope.onairdesk;

import nl.caliope.onairdesk.provider.ItemProvider;
import nl.caliope.onairdesk.provider.NowPlayingProvider;

public abstract class AutomationController
{

	private ItemProvider itemProvider;
	private NowPlayingProvider nowPlayingProvider;

	public ItemProvider getItemProvider()
	{
		return itemProvider;
	}

	public void setItemProvider(ItemProvider itemProvider)
	{
		this.itemProvider = itemProvider;
		this.itemProvider.setAutomationController(this);
	}

	public NowPlayingProvider getNowPlayingProvider()
	{
		return nowPlayingProvider;
	}

	public void setNowPlayingProvider(NowPlayingProvider nowPlayingProvider)
	{
		this.nowPlayingProvider = nowPlayingProvider;
		this.nowPlayingProvider.setAutomationController(this);
	}
}
