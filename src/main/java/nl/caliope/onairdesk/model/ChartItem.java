package nl.caliope.onairdesk.model;

import java.io.Serializable;

import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "chartitem")
public class ChartItem extends Entity
        implements Serializable

{

    private static final long serialVersionUID = -8521344959745115372L;
    private int postion;
    private int itemAutomationID;

    public ChartItem(int postion, int itemAutomationID)
    {

        this.postion = postion;
        this.itemAutomationID = itemAutomationID;
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
        return itemAutomationID;
    }

    public void setItemAutomationID(int itemAutomationID)
    {
        this.itemAutomationID = itemAutomationID;
    }

}
