package nl.caliope.onairdesk.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.caliope.onairdesk.NowplayingListener;
import nl.caliope.onairdesk.model.Item;

public abstract class NowPlayingProvider extends ServiceProvider {

    private List<NowplayingListener> listeners;
    private Map<String, Item> nowplayings = new HashMap<String, Item>();

    public NowPlayingProvider() {
        this.listeners = new ArrayList<NowplayingListener>();
    }

    protected abstract Item retrieveNowPlaying(String station);

    protected abstract Item retrieveNext(String station);

    protected abstract Item retrievePrevious(String station);

    public void update(String station) {

        Item previous = retrievePrevious(station);
        Item current = retrieveNowPlaying(station);
        Item next = retrieveNext(station);
        if (nowplayings.containsKey(station)) {
            if (nowplayings.get(station) == null || !nowplayings.get(station).equals(current)) {
                if (current != null) {
                    fireNowPlayingChanged(previous, current, next, station);
                    nowplayings.put(station, current);
                }
            }
        } else {
            fireNowPlayingChanged(previous, current, next, station);
            nowplayings.put(station, current);
        }

    }

    private void fireNowPlayingChanged(Item previous, Item current, Item next, String station) {
        for (NowplayingListener listener : new ArrayList<NowplayingListener>(this.listeners)) {
            listener.nowPlayingChanged(previous, current, next, station);
        }
    }

    public void addNowPlayingListener(NowplayingListener listener) {
        List<NowplayingListener> listeners = new ArrayList<NowplayingListener>(this.listeners);
        listeners.add(listener);
        this.listeners = listeners;
    }

    public void removeNowPlayingListener(NowplayingListener listener) {
        List<NowplayingListener> listeners = new ArrayList<NowplayingListener>(this.listeners);
        listeners.remove(listener);
        this.listeners = listeners;
    }
}
