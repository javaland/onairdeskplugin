package nl.caliope.onairdesk.provider;

import nl.caliope.onairdesk.PluginConfigurator;

import org.json.JSONObject;

public abstract class ItemFactory
{

	public abstract ItemProvider create(JSONObject configuration);

	public abstract String getDescription();

	public abstract PluginConfigurator createConfigurator(JSONObject configuration);

	@Override
	public String toString()
	{
		return getDescription();
	}
}
