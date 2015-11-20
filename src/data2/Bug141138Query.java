package data2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * Created by Olga Pavlova on 11/9/2015.
 */
public class Bug141138Query {
    static public Boolean onlyActive = true;

    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit");

    static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] a) throws Exception {
        entityManager.getTransaction().begin();

        //1
        entityManager.createNamedQuery(onlyActive ? "findActiveUsersCountByGroups" : "findUsersCountByGroups", Long.class);
        //2
        String queryName = onlyActive ? "findActiveUsersCountByGroups" : "findUsersCountByGroups";
        TypedQuery<Long> query = entityManager.createNamedQuery(queryName, Long.class);


        entityManager.close();
        entityManagerFactory.close();

        Helper.checkData();
    }
}
