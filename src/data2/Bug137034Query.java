package data2;

import data2.Helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Created by Olga Pavlova on 11/9/2015.
 */
public class Bug137034Query {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit");

    static EntityManager entityManager = entityManagerFactory.createEntityManager();

    private final String QUERY_PENDING_POLICIES_IDS = "bla-bla";

    public static void main(String[] a) throws Exception {
        entityManager.getTransaction().begin();

        StringBuilder searchQuery = new StringBuilder();
        searchQuery.append(QUERY_PENDING_POLICIES_IDS);
        Query query = entityManager.createQuery(searchQuery.toString());


        entityManager.close();
        entityManagerFactory.close();

        Helper.checkData();
    }
}
