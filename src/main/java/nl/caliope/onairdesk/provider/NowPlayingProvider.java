package nl.caliope.onairdesk.provider;

import java.util.ArrayList;
import java.util.List;

import nl.caliope.onairdesk.NowplayingListener;
import nl.caliope.onairdesk.model.Item;

public abstract class NowPlayingProvider extends ServiceProvider
{
    private List<NowplayingListener> listeners;
    private Item previous;
    private Item nowPlaying;
    private Item next;

    public NowPlayingProvider()
    {
        this.listeners = new ArrayList<NowplayingListener>();
    }

    protected abstract Item retrieveNowPlaying();
    protected abstract Item retrieveNext();
    protected abstract Item retrievePrevious();
    public void update()
    {
        Item previous = retrievePrevious();
        Item current = retrieveNowPlaying();
        Item next = retrieveNext();
        
        if ((this.nowPlaying == null) ||
                (!this.nowPlaying.equals(current))) {
            
            this.nowPlaying = current;
            this.previous = previous;
            this.next = next;
            if(this.nowPlaying != null){
                fireNowPlayingChanged(this.previous,this.nowPlaying,this.next);
            }
        }
    }

    private void fireNowPlayingChanged(Item previous,Item current, Item next)
    {
        for (NowplayingListener listener : new ArrayList<NowplayingListener>(this.listeners)){
            listener.nowPlayingChanged(previous,current, next);
        }
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