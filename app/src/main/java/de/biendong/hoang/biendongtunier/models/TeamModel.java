package de.biendong.hoang.biendongtunier.models;

/**
 * Created by hoang on 24.11.14.
 */
public class TeamModel {

    private String name, url;

    public TeamModel(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString(){
        return name;
    }
}
