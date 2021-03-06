package nl.caliope.onairdesk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "item")
public class Item extends Entity
        implements Serializable {

    private static final long serialVersionUID = 8528653858312751554L;
    private String title;
    private List<String> artists = new ArrayList<String>();
    private List<String> categories = new ArrayList<String>();
    private String automationid;
    private String albumurl;
    private Integer order;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getArtists() {
        return this.artists;
    }

    public void setArtists(List<String> artists) {
        this.artists = artists;
    }

    public List<String> getCategories() {
        return this.categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getAutomationid() {
        return this.automationid;
    }

    public void setAutomationid(String automationId) {
        this.automationid = automationId;
    }

    public String getAlbumUrl() {
        return albumurl;
    }

    public void setAlbumUrl(String albumUrl) {
        this.albumurl = albumUrl;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Item [title=" + title + ", artists=" + artists + ", categories=" + categories
                + ", automationid=" + automationid + ", order=" + order + ", url=" + albumurl + "]";
    }

    public boolean equals(Object obj) {
        return ((obj instanceof Item))
                && (getAutomationid().equals(((Item) obj).getAutomationid()));
    }
}
