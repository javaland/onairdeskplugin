package nl.caliope.onairdesk.provider;

import org.json.JSONObject;

public abstract class NowPlayingFactory extends ProviderFactory
{
	public abstract NowPlayingProvider create(JSONObject configuration);
}
