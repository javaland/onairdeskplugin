package nl.caliope.onairdesk.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "error")
public class Error
{
	private String message;
	private String stack;

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getStack()
	{
		return stack;
	}

	public void setStack(String stack)
	{
		this.stack = stack;
	}
}
