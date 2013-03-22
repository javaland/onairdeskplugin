package nl.caliope.onairdesk.provider;

import java.util.Date;

import nl.caliope.onairdesk.model.Item;

public abstract class AbstractNowPlayingProvider extends NowPlayingProvider
{
	public static final int CACHE_LIFETIME = 500;

	private Date lastUpdate;
	private Item nowplaying;

	@Override
	public boolean hasChanged(Date from)
	{
		update();

		return this.lastUpdate.after(from);
	}

	@Override
	public Item getNowPlaying()
	{
		update();

		return this.nowplaying;
	}

	private void update()
	{
		if (this.lastUpdate == null ||
				System.currentTimeMillis() - this.lastUpdate.getTime() > CACHE_LIFETIME) {
			this.nowplaying = retrieveNowPlaying();
			this.lastUpdate = new Date();
		}
	}

	public abstract Item retrieveNowPlaying();
}
