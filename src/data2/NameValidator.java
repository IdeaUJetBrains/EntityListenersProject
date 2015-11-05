package data2;


import javax.persistence.PrePersist;

public class NameValidator extends AbstractNameValidator
{
    static final int MAX_NAME_LEN = 40;


   /* @PrePersist
    public void foo(Object obj) {
        System.out.println("PrePersist call FROM CHILD:  " + obj);
    }
*/

}
