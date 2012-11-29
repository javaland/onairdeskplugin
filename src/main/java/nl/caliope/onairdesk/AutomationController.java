package nl.caliope.onairdesk;

import nl.caliope.onairdesk.provider.ItemProvider;
import nl.caliope.onairdesk.provider.NowPlayingProvider;
import nl.caliope.onairdesk.provider.PlaylistProvider;

public abstract class AutomationController
{

	private ItemProvider itemProvider;
	private NowPlayingProvider nowPlayingProvider;
	private PlaylistProvider playlistProvider;

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

	public PlaylistProvider getPlaylistProvider()
	{
		return playlistProvider;
	}

	public void setPlaylistProvider(PlaylistProvider playlistProvider)
	{
		this.playlistProvider = playlistProvider;
		this.playlistProvider.setAutomationController(this);
	}
}
