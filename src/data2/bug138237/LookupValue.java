package data2.bug138237;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/16/2015.
 */
@Entity
@Table(name = "CLASS_TABLE", schema = "PUBLIC")
public class LookupValue {

    private int id;
    private String clazz;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CLASS", nullable = true, length = 255)
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
