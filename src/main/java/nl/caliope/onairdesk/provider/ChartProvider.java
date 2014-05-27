package nl.caliope.onairdesk.provider;

import java.io.IOException;
import java.util.List;

import nl.caliope.onairdesk.model.Chart;

public abstract class ChartProvider extends ServiceProvider
{
    public abstract void saveChart(Chart paramChart) throws IOException;
    public abstract List<Chart> getCharts(int year,int week) throws IOException;
}