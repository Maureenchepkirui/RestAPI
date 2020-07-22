package dao;

import models.Departments;
import models.Users;

import java.util.List;

public interface UsersDao {

    //create

    void  add(Users user);

    //read

    List<Users> getAll();
    List<Departments> getAllUserDepartments(int user_id);
    Users findById(int id);

    //update

    //delete

    void clearAll();
}
