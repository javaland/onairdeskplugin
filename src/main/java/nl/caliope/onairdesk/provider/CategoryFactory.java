package nl.caliope.onairdesk.provider;

import org.json.JSONObject;

public abstract class CategoryFactory extends ProviderFactory
{
    public abstract CategoryProvider create(JSONObject configuration);

  
}
