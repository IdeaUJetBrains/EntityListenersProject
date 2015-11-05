package data2;

import javax.persistence.PreUpdate;

/**
 * Created by Olga Pavlova on 11/5/2015.
 */
public class EmployeeDebugListener {

    @PreUpdate
    public void preUpdate(Employee emp) {
        System.out.println("EmployeeDebugListener.Update called on employee id: "
                + emp.getId());
    }


}