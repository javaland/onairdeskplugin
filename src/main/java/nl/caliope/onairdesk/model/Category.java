package nl.caliope.onairdesk.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "category")
public class Category
{
	private List<String> path = new ArrayList<String>();

	public Category()
	{
	}

	public List<String> getPath()
	{
		return path;
	}

	public void setPath(List<String> path)
	{
		this.path = path;
	}
}
