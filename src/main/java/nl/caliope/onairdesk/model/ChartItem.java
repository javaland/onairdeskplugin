package nl.caliope.onairdesk.model;

import java.io.Serializable;

import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "chartitem")
public class ChartItem extends Entity
        implements Serializable

{

    private static final long serialVersionUID = -8521344959745115372L;
    private int postion;
    private int automationid;

    public ChartItem(int postion, int automationid)
    {

        this.postion = postion;
        this.automationid = automationid;
    }

    public int getPostion()
    {
        return postion;
    }

    public void setPostion(int postion)
    {
        this.postion = postion;
    }

    public int getItemAutomationID()
    {
        return automationid;
    }

    public void setItemAutomationID(int itemAutomationID)
    {
        this.automationid = itemAutomationID;
    }

}
