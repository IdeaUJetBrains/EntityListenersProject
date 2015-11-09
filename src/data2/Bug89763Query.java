package data2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Created by Olga Pavlova on 11/9/2015.
 */
public class Bug89763Query {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit");

    static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] a) throws Exception {
        entityManager.getTransaction().begin();

        Query query = null;
        String str = "WHERE e.id=:a";
        query = entityManager.createQuery("SELECT e FROM Employee e  ");
        query.setParameter("a", 2);

        String str1 = "SELECT e FROM Employee e WHERE e.id=:a";
        String str2 = "SELECT e FROM Employee e " + str;
        query = entityManager.createQuery(str2.toString());
        query.setParameter("a22erqew", 2);

        entityManager.close();
        entityManagerFactory.close();

        Helper.checkData();
    }
}
