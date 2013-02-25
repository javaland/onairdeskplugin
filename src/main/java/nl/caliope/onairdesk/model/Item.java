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
	private List<Category> categories = new ArrayList<Category>();
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

	public List<Category> getCategories()
	{
		return categories;
	}

	public void setCategories(List<Category> categories)
	{
		this.categories = categories;
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
		return "Item [title=" + title + ", artists=" + artists + ", categories=" + categories
				+ ", automationId=" + automationId + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Item
				&& getAutomationId().equals(((Item) obj).getAutomationId());
	}

}
