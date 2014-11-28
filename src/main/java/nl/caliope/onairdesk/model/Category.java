package nl.caliope.onairdesk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "category")
public class Category extends Entity implements Serializable
{
    /**
     * 
     */
    private int categoryId;
    private static final long serialVersionUID = -8027537872471523783L;
    private String name;
    private List<String> children = new ArrayList<String>();

 
  

    public Category(int categoryId, String name)
    {
        this.categoryId = categoryId;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<String> getChildren()
    {
        return children;
    }

    public void setChildren(List<String> children)
    {
        this.children = children;
    }

    public void addChild(String child)
    {
        this.children.add(child);
    }

}
