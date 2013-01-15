package nl.caliope.onairdesk.provider;

import org.json.JSONObject;

public abstract class ProviderFactory
{

	public abstract ProviderFactoryConfigurator createConfigurator(JSONObject configuration);

	public abstract String getDescription();

	@Override
	public String toString()
	{
		return getDescription();
	}
}
