package data2;

import javax.persistence.*;

@Entity
@EntityListeners({EmployeeDebugListener.class, NameValidator.class})
public class Employee {

    @Id private int id;
    private String name;
    @Transient private long syncTime;


    @PostPersist
    @PostUpdate
    @PostLoad
    private void resetSyncTime() {
        syncTime = System.currentTimeMillis();
        System.out.println("Employee.resetSyncTime called on employee id: " + getId());
    }

    public long getCachedAge() {
        return System.currentTimeMillis() - syncTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Employee id: " + getId() ;
    }
}