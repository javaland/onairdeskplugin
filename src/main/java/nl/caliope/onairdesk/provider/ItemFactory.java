package nl.caliope.onairdesk.provider;

import org.json.JSONObject;

public abstract class ItemFactory extends ProviderFactory
{
	public abstract ItemProvider create(JSONObject configuration);
}
