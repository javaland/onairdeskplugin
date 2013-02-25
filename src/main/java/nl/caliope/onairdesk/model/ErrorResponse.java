package nl.caliope.onairdesk.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class ErrorResponse
{
	private Error error;

	public ErrorResponse()
	{

	}

	public Error getError()
	{
		return error;
	}

	public void setError(Error error)
	{
		this.error = error;
	}
}
