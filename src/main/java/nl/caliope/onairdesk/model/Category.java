package nl.caliope.onairdesk.model;

import java.io.Serializable;

import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "category")
public class Category extends Entity implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = -8027537872471523783L;
    private String name;
  
    
    public Category(String name)
    {
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

}
