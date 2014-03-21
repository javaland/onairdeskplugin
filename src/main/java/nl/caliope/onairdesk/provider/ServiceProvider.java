package nl.caliope.onairdesk.provider;

import nl.caliope.onairdesk.AutomationController;

public abstract class ServiceProvider
{
    private AutomationController automationController;

    public AutomationController getAutomationController()
    {
        return this.automationController;
    }

    public void setAutomationController(AutomationController automationController)
    {
        this.automationController = automationController;
    }
}