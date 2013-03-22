package nl.caliope.onairdesk.model;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement(name = "parent")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChartParent
{
	private Map configuration;
	private String name;
	private int size;

	public Map getConfiguration()
	{
		return configuration;
	}

	public void setConfiguration(Map configuration)
	{
		this.configuration = configuration;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	@Override
	public String toString()
	{
		return "ChartParent [configuration=" + configuration + ", name=" + name + ", size=" + size
				+ "]";
	}

}
