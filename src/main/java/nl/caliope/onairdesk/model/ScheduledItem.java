package nl.caliope.onairdesk.model;

import java.io.Serializable;
import java.util.Comparator;

import nl.caliope.onairdesk.OnairdeskResource;

@OnairdeskResource(name = "scheduleditem")
public class ScheduledItem extends Entity implements Serializable {

    private static final long serialVersionUID = -7820224747828778124L;

    public static Comparator<ScheduledItem> DATE_COMPARATOR = new Comparator<ScheduledItem>() {
        public int compare(ScheduledItem o1, ScheduledItem o2) {
            long thisDate = o1.getDate();
            long thatDate = o2.getDate();

            if (thisDate == thatDate) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    private long date;
    private String automationid;
    private int length;
    private long startTime;
    private long postroll;
    private long preroll;
    private long nextPoint;
    private int breakType;
    private int playitemtypeid;
    private int fadecode;
    private int intro;

    public ScheduledItem() {
    }

    public ScheduledItem(long date, String automationid) {
        this.date = date;
        this.automationid = automationid;
    }

    public ScheduledItem(String automationid, int length, long startTime, long postroll, long preroll, long nextPoint, int breakType, int playitemtypeid, int fadecode,int intro) {
        this.automationid = automationid;
        this.length = length;
        this.startTime = startTime;
        this.postroll = postroll;
        this.preroll = preroll;
        this.nextPoint = nextPoint;
        this.breakType = breakType;
        this.playitemtypeid = playitemtypeid;
        this.fadecode = fadecode;
        this.intro = intro;
    }

    public String getAutomationid() {
        return automationid;
    }

    public void setAutomationid(String automationid) {
        this.automationid = automationid;
    }

    public long getDate() {
        return this.date;
    }

    public void setDate(long scheduledDate) {
        this.date = scheduledDate;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getPostroll() {
        return postroll;
    }

    public void setPostroll(long postroll) {
        this.postroll = postroll;
    }

    public long getPreroll() {
        return preroll;
    }

    public void setPreroll(long preroll) {
        this.preroll = preroll;
    }

    public long getNextPoint() {
        return nextPoint;
    }

    public void setNextPoint(long nextPoint) {
        this.nextPoint = nextPoint;
    }

    public int getBreakType() {
        return breakType;
    }

    public void setBreakType(int breakType) {
        this.breakType = breakType;
    }

    public int getPlayitemtypeid() {
        return playitemtypeid;
    }

    public void setPlayitemtypeid(int playitemtypeid) {
        this.playitemtypeid = playitemtypeid;
    }

    public int getFadecode() {
        return fadecode;
    }

    public void setFadecode(int fadecode) {
        this.fadecode = fadecode;
    }

    public int getIntro() {
        return intro;
    }

    public void setIntro(int intro) {
        this.intro = intro;
    }

    
    public long getPlayLength() {
        long length = Math.max(0, getLength());
        long preroll = Math.max(0, getPreroll());
        long postroll = Math.max(0, getPostroll());
        long playLength = Math.max(0, length - (preroll + postroll));
        return playLength;
    }
}
