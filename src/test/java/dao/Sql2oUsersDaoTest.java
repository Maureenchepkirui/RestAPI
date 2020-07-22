package dao;

import models.Departments;
import models.Users;

import static org.junit.jupiter.api.Assertions.*;

class Sql2oUsersDaoTest {

}
//helper
private Departments setUpNewDepartment() {
    return new Departments("Kopaloans", "microfinance");
}

    private Users setUpNewUser() {
        return new Users("Maureen", "Manager", "Managing Director");
    }
}