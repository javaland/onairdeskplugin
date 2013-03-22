package nl.caliope.onairdesk.model;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement(name = "chart")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Chart
{
	private ChartParent parent;
	private Date from;
	private Date to;
	private Item[] items;

	public Chart()
	{
	}

	public ChartParent getParent()
	{
		return parent;
	}

	public void setParent(ChartParent parent)
	{
		this.parent = parent;
	}

	public Date getFrom()
	{
		return from;
	}

	public void setFrom(Date from)
	{
		this.from = from;
	}

	public Date getTo()
	{
		return to;
	}

	public void setTo(Date to)
	{
		this.to = to;
	}

	public Item[] getItems()
	{
		return items;
	}

	public void setItems(Item[] items)
	{
		this.items = items;
	}

	@Override
	public String toString()
	{
		return "Chart [parent=" + parent + ", from=" + from + ", to=" + to + ", items="
				+ Arrays.toString(items) + "]";
	}
}
