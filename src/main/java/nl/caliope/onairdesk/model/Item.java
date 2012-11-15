package nl.caliope.onairdesk.model;

import java.io.Serializable;
import java.util.List;

public class Item implements Serializable
{

	private static final long serialVersionUID = 8528653858312751554L;
	private String title;
	private List<String> artists;
	private String automationId;

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public List<String> getArtists()
	{
		return artists;
	}

	public void setArtists(List<String> artists)
	{
		this.artists = artists;
	}

	public String getAutomationId()
	{
		return automationId;
	}

	public void setAutomationId(String automationId)
	{
		this.automationId = automationId;
	}

	@Override
	public String toString()
	{
		return String.format("[Item id=%s, name=%s, artists=%s]",
				this.automationId,
				this.title,
				String.valueOf(this.artists));
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Item
				&& getAutomationId().equals(((Item) obj).getAutomationId());
	}

}
