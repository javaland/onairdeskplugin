package nl.caliope.onairdesk;

import javax.swing.JComponent;

import org.json.JSONObject;

public abstract class PluginConfigurator
{
	private final JSONObject configuration;

	public PluginConfigurator(JSONObject configuration)
	{
		if (configuration == null) {
			configuration = new JSONObject();
		}

		this.configuration = configuration;
	}

	public JSONObject getConfiguration()
	{
		return configuration;
	}

	public abstract String getIdentifier();

	public abstract JComponent getEditorComponent();

	public abstract boolean isValidConfiguration();
}
