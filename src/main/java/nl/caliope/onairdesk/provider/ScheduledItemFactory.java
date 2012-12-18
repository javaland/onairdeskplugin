package nl.caliope.onairdesk.provider;

import nl.caliope.onairdesk.PluginConfigurator;

import org.json.JSONObject;

public abstract class ScheduledItemFactory
{
	public abstract ScheduledItemProvider create(JSONObject configuration);

	public abstract PluginConfigurator createConfigurator(JSONObject configuration);

	public abstract String getDescription();

	@Override
	public String toString()
	{
		return getDescription();
	}
}
