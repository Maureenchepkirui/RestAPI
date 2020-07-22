package models;

public class Department_News extends News {

    private String news_type;
    private int department_id;
    private final String TYPE_OF_NEWS="department";


    public Department_News(String title, String description,int department_id, int user_id) {
        super(title, description, user_id);
        this.department_id = department_id;
        this.news_type=TYPE_OF_NEWS;
    }

    @Override
    public String getNews_type() {
        return news_type;
    }

    @Override
    public int getDepartment_id() {
        return department_id;
    }
}
