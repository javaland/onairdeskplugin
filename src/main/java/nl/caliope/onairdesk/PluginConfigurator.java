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

	@Override
	public boolean equals(Object obj)
	{
		return (obj instanceof PluginConfigurator)
				&& this.getIdentifier() != null
				&& this.getIdentifier().equals(((PluginConfigurator) obj).getIdentifier());
	}
}
