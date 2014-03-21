package nl.caliope.onairdesk;

import nl.caliope.onairdesk.provider.ChartProvider;
import nl.caliope.onairdesk.provider.ItemProvider;
import nl.caliope.onairdesk.provider.NowPlayingProvider;
import nl.caliope.onairdesk.provider.ScheduledItemProvider;

public abstract interface AutomationController
{
    public abstract ItemProvider getItemProvider();

    public abstract NowPlayingProvider getNowPlayingProvider();

    public abstract ScheduledItemProvider getScheduledItemProvider();

    public abstract ChartProvider getChartProvider();
}