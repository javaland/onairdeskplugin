package nl.caliope.onairdesk;

import nl.caliope.onairdesk.provider.ItemProvider;
import nl.caliope.onairdesk.provider.NowPlayingProvider;
import nl.caliope.onairdesk.provider.ScheduledItemProvider;

public interface AutomationController
{
	public ItemProvider getItemProvider();

	public NowPlayingProvider getNowPlayingProvider();

	public ScheduledItemProvider getScheduledItemProvider();
}
