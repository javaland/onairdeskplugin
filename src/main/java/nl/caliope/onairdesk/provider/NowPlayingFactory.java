package nl.caliope.onairdesk.provider;

import nl.caliope.onairdesk.PluginConfigurator;

import org.json.JSONObject;

public abstract class NowPlayingFactory
{
	public abstract NowPlayingProvider create(JSONObject configuration);

	public abstract String getDescription();

	public abstract PluginConfigurator createConfigurator(JSONObject configuration);

	@Override
	public String toString()
	{
		return getDescription();
	}
}
