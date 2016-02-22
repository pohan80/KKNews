package practice.hanchen.kknews.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "ARTICLE".
 */
public class Article {

    private Long id;
    private long channelId;
    /** Not-null value. */
    private String title;
    /** Not-null value. */
    private String picURL;
    /** Not-null value. */
    private String description;

    public Article() {
    }

    public Article(Long id) {
        this.id = id;
    }

    public Article(Long id, long channelId, String title, String picURL, String description) {
        this.id = id;
        this.channelId = channelId;
        this.title = title;
        this.picURL = picURL;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    /** Not-null value. */
    public String getTitle() {
        return title;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTitle(String title) {
        this.title = title;
    }

    /** Not-null value. */
    public String getPicURL() {
        return picURL;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }

    /** Not-null value. */
    public String getDescription() {
        return description;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDescription(String description) {
        this.description = description;
    }

}