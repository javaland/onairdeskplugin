package nl.caliope.onairdesk.model;

import java.io.Serializable;
import java.util.Comparator;


import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "scheduleditem")
public class ScheduledItem extends Entity implements Serializable
{

    private static final long serialVersionUID = -7820224747828778124L;

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
    private String automationid;
    private int length;
   
    
    public ScheduledItem()
    {
    }

    public ScheduledItem(long date, String automationid)
    {
        this.date = date;
        this.automationid = automationid;
    }

    public ScheduledItem(long date, String automationid, int length)
    {
        this(date, automationid);
        this.length = length;
    }

    public String getAutomationid()
    {
        return automationid;
    }

    public void setAutomationid(String automationid)
    {
        this.automationid = automationid;
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
