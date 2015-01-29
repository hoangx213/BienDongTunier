package de.biendong.hoang.biendongtunier.models;

/**
 * Created by hoang on 24.11.14.
 */
public class NewsModel {

    private String news;
    private String date;

    public NewsModel(String news, String date){
        this.news = news;
        this.date = date;
    }

    public String getNews(){
        return news;
    }

    public void setNews(String news){
        this.news = news;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
