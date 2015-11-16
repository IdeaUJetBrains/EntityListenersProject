package data2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Created by Olga Pavlova on 11/9/2015.
 */
public class Bug136011Query {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit");

    static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] a) throws Exception {
        entityManager.getTransaction().begin();

        //todo uncomment for view a bug
       // Long rs1 = entityManager.createQuery("SELECT COUNT(p) FROM Entity e").getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        Helper.checkData();
    }
}
