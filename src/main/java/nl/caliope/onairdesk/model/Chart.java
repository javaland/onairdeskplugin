package nl.caliope.onairdesk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "chart")
public class Chart extends Entity implements Serializable
{
    private static final long serialVersionUID = -4454783102154137685L;
    private String name;
    private int automationid;
    private int week;
    private int year;
    private List<ChartItem> items =  new ArrayList<ChartItem>();

    public Chart(String chartName, int chartAutomationID)
    {
        this.name = chartName;
        this.automationid = chartAutomationID;
    }

    public String getChartName()
    {
        return name;
    }

    public void setChartName(String chartName)
    {
        this.name = chartName;
    }

    public int getChartAutomationID()
    {
        return automationid;
    }

    public void setChartAutomationID(int chartAutomationID)
    {
        this.automationid = chartAutomationID;
    }

    public int getWeek()
    {
        return week;
    }

    public void setWeek(int week)
    {
        this.week = week;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public List<ChartItem> getItems()
    {
        return this.items;
    }

    public void setItems(List<ChartItem> items)
    {
        this.items = items;
    }

    public String toString()
    {
        return "Chart [name=" + this.name + "]";
    }
}
