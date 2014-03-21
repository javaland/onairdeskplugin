package nl.caliope.onairdesk.provider;

import java.util.ArrayList;
import java.util.List;

import nl.caliope.onairdesk.NowplayingListener;
import nl.caliope.onairdesk.model.Item;

public abstract class NowPlayingProvider extends ServiceProvider
{
    private List<NowplayingListener> listeners;
    private Item nowPlaying;

    public NowPlayingProvider()
    {
        this.listeners = new ArrayList<NowplayingListener>();
    }

    protected abstract Item retrieveNowPlaying();

    public void update()
    {
        Item current = retrieveNowPlaying();

        if ((this.nowPlaying == null) ||
                (!this.nowPlaying.equals(current))) {
            this.nowPlaying = current;
            fireNowPlayingChanged(current);
        }
    }

    private void fireNowPlayingChanged(Item item)
    {
        for (NowplayingListener listener : new ArrayList<NowplayingListener>(this.listeners))
            listener.nowPlayingChanged(item);
    }

    public void addNowPlayingListener(NowplayingListener listener)
    {
        List<NowplayingListener> listeners = new ArrayList<NowplayingListener>(this.listeners);
        listeners.add(listener);
        this.listeners = listeners;
    }

    public void removeNowPlayingListener(NowplayingListener listener)
    {
        List<NowplayingListener> listeners = new ArrayList<NowplayingListener>(this.listeners);
        listeners.remove(listener);
        this.listeners = listeners;
    }
}