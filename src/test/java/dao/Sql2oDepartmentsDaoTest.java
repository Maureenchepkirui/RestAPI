package dao;

import models.Departments;
import models.Users;


public class Sql2oDepartmentsDaoTest {


    private Departments setUpDepartment() {
        return new Departments("Kopaloans", "microfinance");
    }

    private Users setUpNewUsers() {
        return new Users("Maureen", "Manager", "Managing Director");
    }
}