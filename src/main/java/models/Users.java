package models;

import java.util.Objects;

public class Users {

    private int id;
    private  String name;
    private String position;
    private String staff_role;
    private int departmentId;


    public Users(String name, String position, String staff_role,int departmentId) {
        this.name = name;
        this.position = position;
        this.staff_role = staff_role;
        this.departmentId = departmentId;

    }

    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public String getPosition()
    {
        return position;
    }

    public String getStaff_role() {

        return staff_role;
    }

    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id &&
                departmentId == users.departmentId &&
                Objects.equals(name, users.name) &&
                Objects.equals(position, users.position) &&
                Objects.equals(staff_role, users.staff_role) ;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, position, staff_role,departmentId);
    }
}
