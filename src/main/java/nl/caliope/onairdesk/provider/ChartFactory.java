package nl.caliope.onairdesk.provider;

import org.json.JSONObject;

public abstract class ChartFactory extends ProviderFactory
{
  public abstract ChartProvider create(JSONObject paramJSONObject);
}