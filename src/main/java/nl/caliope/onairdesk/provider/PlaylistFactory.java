package nl.caliope.onairdesk.provider;

import nl.caliope.onairdesk.PluginConfigurator;

import org.json.JSONObject;

public abstract class PlaylistFactory
{
	public abstract PlaylistProvider create(JSONObject configuration);

	public abstract PluginConfigurator createConfigurator(JSONObject configuration);

	public abstract String getDescription();

	@Override
	public String toString()
	{
		return getDescription();
	}
}
