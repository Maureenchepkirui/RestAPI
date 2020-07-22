package models;

import java.util.Objects;

public class News {



    public int getId() {
        return id;
    }
    private int id;
    private String news_type;
    private int department_id;
    private int user_id;
    private String title;
    private String description;
    private final String TYPE_OF_NEWS="general";



    public News(String title, String description, int user_id) {
        this.title = title;
        this.description = description;
        this.user_id=user_id;
        this.news_type=TYPE_OF_NEWS;
        this.department_id=0;
    }
    public News(String title, String description,int department_id, int user_id){
        this.title = title;
        this.description = description;
        this.user_id=user_id;
        this.department_id = department_id;
        this.news_type="department";
    }
    public int getUser_id() {
        return user_id;
    }

    public String getNews_type() {
        return news_type;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id == news.id &&
                department_id == news.department_id &&
                user_id == news.user_id &&
                Objects.equals(news_type, news.news_type) &&
                Objects.equals(title, news.title) &&
                Objects.equals(description, news.description) &&
                Objects.equals(TYPE_OF_NEWS, news.TYPE_OF_NEWS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, news_type, department_id, user_id, title, description, TYPE_OF_NEWS);
    }
}
