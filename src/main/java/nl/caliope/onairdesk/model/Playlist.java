package nl.caliope.onairdesk.model;

import java.util.List;

public class Playlist
{
	private List<PlaylistItem> items;

	public Playlist(List<PlaylistItem> items)
	{
		this.items = items;
	}

	public List<PlaylistItem> getItems()
	{
		return items;
	}

	public void setItems(List<PlaylistItem> items)
	{
		this.items = items;
	}
}
