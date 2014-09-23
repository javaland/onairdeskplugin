package nl.caliope.onairdesk.model;

import java.io.Serializable;

import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "chartitem")
public class ChartItem extends Entity
        implements Serializable

{

    private static final long serialVersionUID = -8521344959745115372L;
    private int position;
    private int automationid;

    public ChartItem(int position, int automationid)
    {

        this.position = position;
        this.automationid = automationid;
    }

    public int getPosition()
    {
        return position;
    }

    public void setPosition(int position)
    {
        this.position = position;
    }

    public int getAutomationID()
    {
        return automationid;
    }

    public void setAutomationID(int automationID)
    {
        this.automationid = automationID;
    }

    @Override
    public String toString()
    {
        return "ChartItem [position=" + position + ", automationid=" + automationid + "]";
    }
    

}
