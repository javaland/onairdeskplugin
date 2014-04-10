package nl.caliope.onairdesk.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "scheduleditem")
public class ScheduledItem extends Entity implements Serializable
{
    private static final long serialVersionUID = -1980527126021335300L;

    public static Comparator<ScheduledItem> DATE_COMPARATOR = new Comparator<ScheduledItem>()
    {
        public int compare(ScheduledItem o1, ScheduledItem o2)
        {
            Date thisDate = o1.getDate();
            Date thatDate = o2.getDate();

            return thisDate.compareTo(thatDate);
        }
    };

    private Date date;
    private Item item;
    private int length;
    private String command;
    
    public ScheduledItem()
    {
    }

    public ScheduledItem(Date date, Item item)
    {
        this.date = date;
        this.item = item;
    }

    public ScheduledItem(Date date, Item item, int length)
    {
        this(date, item);
        this.length = length;
    }
    
    public ScheduledItem(Date date, Item item, int length ,String command)
    {
        this(date, item);
        this.length = length;
        this.command = command;
    }

    public Item getItem()
    {
        return this.item;
    }

    public void setItem(Item item)
    {
        this.item = item;
    }

    public Date getDate()
    {
        return this.date;
    }

    public void setDate(Date scheduledDate)
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

    public String getCommand()
    {
        return command;
    }

    public void setCommand(String command)
    {
        this.command = command;
    }
    
    
}
