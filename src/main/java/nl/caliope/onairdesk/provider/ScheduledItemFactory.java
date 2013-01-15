package nl.caliope.onairdesk.provider;

import org.json.JSONObject;

public abstract class ScheduledItemFactory extends ProviderFactory
{
	public abstract ScheduledItemProvider create(JSONObject configuration);
}
