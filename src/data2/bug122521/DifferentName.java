package data2.bug122521;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "EXISTENT")
public class DifferentName implements Serializable {

    private int existentId;

    @Id
    public int getExistentId() {
        return existentId;
    }

    public void setExistentId(int existentId) {
        this.existentId = existentId;
    }

    @Column(name = "EXISTENT_NAME")
    private String field;
}
