package data2.bug58803;

import data2.EmployeeDebugListener;
import data2.NameValidator;

import javax.persistence.*;

@Entity
@NamedNativeQuery(name = "user", query = "INSERT INTO EMPLOYEE NAME values #username")
public class Employee1 {

    private int id;
    private String name;

    @Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Basic
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}