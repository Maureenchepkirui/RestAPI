package dao;

import models.Departments;
import models.Users;
import org.junit.Before;
import org.sql2o.Connection;
import org.sql2o.Sql2o;


public class Sql2oDepartmentsDaoTest {
    private static Sql2oDepartmentsDao sql2oDepartmentsDao;
    private static Sql2oUsersDao sql2oUsersDao;
    private static Sql2oNewsDao sql2oNewsDao;
    private static Connection conn;

    @Before
    public void setUp() throws Exception {

        String connectionString = "jdbc:postgresql://localhost:5432/organisational_news_portal_test";
        Sql2o sql2o = new Sql2o(connectionString, "maureenbett", "kenyan082bett");


        sql2oDepartmentsDao=new Sql2oDepartmentsDao(sql2o);
        sql2oUsersDao=new Sql2oUsersDao(sql2o);
        sql2oNewsDao=new Sql2oNewsDao(sql2o);
        System.out.println("connected to database");
        conn=sql2o.open();

    }



    private Departments setUpDepartment() {
        return new Departments("Kopaloans", "microfinance");
    }

    private Users setUpNewUsers() {
        return new Users("Maureen", "Manager", "Managing Director");
    }
}