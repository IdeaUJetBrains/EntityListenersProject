package data2;


import javax.persistence.PrePersist;


/**
 * Created by Olga Pavlova on 11/5/2015.
 */
public abstract class AbstractNameValidator {

    @PrePersist
    public void foo(Object obj) {
        System.out.println("PrePersist call FROM Parent:  " + obj);
    }

}
