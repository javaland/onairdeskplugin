package nl.caliope.onairdesk.model;

import java.io.Serializable;
import java.util.Map;
import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "chartparent")
public class ChartParent extends Entity implements Serializable
{
    private static final long serialVersionUID = 2218091187697384313L;
    private Map<Object, Object> configuration;
    private String name;
    private int size;

    public Map<Object, Object> getConfiguration()
    {
        return this.configuration;
    }

    public void setConfiguration(Map<Object, Object> configuration)
    {
        this.configuration = configuration;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSize()
    {
        return this.size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public String toString()
    {
        return "ChartParent [configuration=" + this.configuration +
                ", name=" + this.name + ", size=" + this.size + "]";
    }
}