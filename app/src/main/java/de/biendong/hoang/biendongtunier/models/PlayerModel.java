package de.biendong.hoang.biendongtunier.models;

/**
 * Created by hoang on 24.11.14.
 */
public class PlayerModel {

    private String name;
    private int number;
    private String imgUrl;

    //TODO: more Infos: height, weight, state, extraInfo...


    public PlayerModel(String name, int number, String imgUrl) {
        this.name = name;
        this.number = number;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
