package nl.caliope.onairdesk.provider;

import java.io.IOException;

import nl.caliope.onairdesk.model.Chart;

public abstract class ChartProvider extends ServiceProvider
{
    public abstract void saveChart(Chart paramChart) throws IOException;
}