package nl.caliope.onairdesk.model;

import java.io.Serializable;
import java.util.Comparator;


import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "scheduleditem")
public class ScheduledItem extends Entity implements Serializable
{
    private static final long serialVersionUID = -1980527126021335300L;

    public static Comparator<ScheduledItem> DATE_COMPARATOR = new Comparator<ScheduledItem>()
    {
        public int compare(ScheduledItem o1, ScheduledItem o2)
        {
            long thisDate = o1.getDate();
            long thatDate = o2.getDate();

            if(thisDate == thatDate){
                return 1;
            } else {
                return 0;
            }
        }
    };

    private long date;
    private Item item;
    private int length;
   
    
    public ScheduledItem()
    {
    }

    public ScheduledItem(long date, Item item)
    {
        this.date = date;
        this.item = item;
    }

    public ScheduledItem(long date, Item item, int length)
    {
        this(date, item);
        this.length = length;
    }
    
    public Item getItem()
    {
        return this.item;
    }

    public void setItem(Item item)
    {
        this.item = item;
    }

    public long getDate()
    {
        return this.date;
    }

    public void setDate(long scheduledDate)
    {
        this.date = scheduledDate;
    }

    public int getLength()
    {
        return this.length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    
}
