package de.biendong.hoang.biendongtunier.models;

/**
 * Created by hoang on 24.11.14.
 */
public class PicModel {

    private String title, date, imgUrl, description;

    public PicModel(String title, String date, String imgUrl, String description) {
        this.title = title;
        this.date = date;
        this.imgUrl = imgUrl;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
