package nl.caliope.onairdesk.provider;

import java.util.List;

import javax.swing.JComponent;

import org.json.JSONObject;

public abstract class ProviderFactoryConfigurator
{
	private final JSONObject configuration;

	public ProviderFactoryConfigurator(JSONObject configuration)
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

	public abstract List<String> getValidationErrors();

	@Override
	public boolean equals(Object obj)
	{
		return (obj instanceof ProviderFactoryConfigurator)
				&& this.getIdentifier() != null
				&& this.getIdentifier().equals(((ProviderFactoryConfigurator) obj).getIdentifier());
	}
}
