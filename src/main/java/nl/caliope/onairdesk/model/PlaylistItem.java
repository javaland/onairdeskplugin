package nl.caliope.onairdesk.model;

import java.util.Comparator;
import java.util.Date;

public class PlaylistItem
{

	/**
	 * a compator that compares two {@link PlaylistItem} by scheduled date
	 */
	public static Comparator<PlaylistItem> DATE_COMPARATOR = new Comparator<PlaylistItem>()
	{
		public int compare(PlaylistItem o1, PlaylistItem o2)
		{
			Date thisDate = o1.getScheduledDate();
			Date thatDate = o2.getScheduledDate();

			return thisDate.compareTo(thatDate);
		}
	};

	private Date scheduledDate;
	private Item item;

	public PlaylistItem()
	{

	}

	public PlaylistItem(Date scheduledDate, Item item)
	{
		this.scheduledDate = scheduledDate;
		this.item = item;
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
}
