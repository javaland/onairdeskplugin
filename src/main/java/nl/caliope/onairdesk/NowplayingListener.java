package nl.caliope.onairdesk;

import nl.caliope.onairdesk.model.Item;

public interface NowplayingListener
{
    public abstract void nowPlayingChanged(Item previous, Item current, Item next,String station);
}
