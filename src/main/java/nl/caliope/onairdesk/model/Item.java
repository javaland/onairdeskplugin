package nl.caliope.onairdesk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class Item implements Serializable
{

	private static final long serialVersionUID = 8528653858312751554L;
	private String title;
	private List<String> artists = new ArrayList<String>();
	private List<String[]> categories = new ArrayList<String[]>();
	private String automationid;

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

	public List<String[]> getCategories()
	{
		return categories;
	}

	public void setCategories(List<String[]> categories)
	{
		this.categories = categories;
	}

	public String getAutomationid()
	{
		return automationid;
	}

	public void setAutomationid(String automationId)
	{
		this.automationid = automationId;
	}

	@Override
	public String toString()
	{
		return "Item [title=" + title + ", artists=" + artists + ", categories=" + categories
				+ ", automationId=" + automationid + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Item
				&& getAutomationid().equals(((Item) obj).getAutomationid());
	}

}
