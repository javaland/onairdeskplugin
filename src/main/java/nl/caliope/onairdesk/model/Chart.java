package nl.caliope.onairdesk.model;

import java.io.Serializable;
import java.util.Arrays;
import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "chart")
public class Chart extends Entity implements Serializable
{
    private static final long serialVersionUID = -4454783102154137685L;

    private ChartParent parent;
    private Item[] items;

    public ChartParent getParent()
    {
        return this.parent;
    }

    public void setParent(ChartParent parent)
    {
        this.parent = parent;
    }

    public Item[] getItems()
    {
        return this.items;
    }

    public void setItems(Item[] items)
    {
        this.items = items;
    }

    public String toString()
    {
        return "Chart [parent=" + this.parent + ", items=" + Arrays.toString(this.items) + "]";
    }
}
