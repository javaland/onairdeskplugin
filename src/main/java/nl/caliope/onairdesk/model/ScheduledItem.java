package nl.caliope.onairdesk.model;

import java.util.Comparator;
import java.util.Date;

public class ScheduledItem
{

	/**
	 * a compator that compares two {@link ScheduledItem} by scheduled date
	 */
	public static Comparator<ScheduledItem> DATE_COMPARATOR = new Comparator<ScheduledItem>()
	{
		public int compare(ScheduledItem o1, ScheduledItem o2)
		{
			Date thisDate = o1.getScheduledDate();
			Date thatDate = o2.getScheduledDate();

			return thisDate.compareTo(thatDate);
		}
	};

	private Date scheduledDate;
	private Item item;
	private int length;

	public ScheduledItem()
	{

	}

	public ScheduledItem(Date scheduledDate, Item item, int length)
	{
		this.scheduledDate = scheduledDate;
		this.item = item;
		this.length = length;
	}

	public Item getItem()
	{
		return item;
	}

	public void setItem(Item item)
	{
		this.item = item;
	}

	public Date getScheduledDate()
	{
		return scheduledDate;
	}

	public void setScheduledDate(Date scheduledDate)
	{
		this.scheduledDate = scheduledDate;
	}

	public int getLength()
	{
		return length;
	}

	public void setLength(int length)
	{
		this.length = length;
	}
}
