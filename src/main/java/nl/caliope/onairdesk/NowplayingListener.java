package nl.caliope.onairdesk;

import nl.caliope.onairdesk.model.Item;

public interface NowplayingListener
{
    public abstract void nowPlayingChanged(Item item);
}
