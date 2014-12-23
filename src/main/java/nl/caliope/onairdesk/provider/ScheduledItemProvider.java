package nl.caliope.onairdesk.provider;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import nl.caliope.onairdesk.model.ScheduledItem;

public abstract class ScheduledItemProvider extends ServiceProvider
{

    /**
     * returns the playlist of the given date
     * 
     * @param from
     * @param to
     * @param station
     * @param date
     * @return
     * @throws IOException
     */
    public abstract List<ScheduledItem> getScheduledItems(Date from, Date to,String station) throws IOException;

}
