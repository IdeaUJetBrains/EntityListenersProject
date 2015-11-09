package data2.bug58803;

import data2.Helper;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 11/9/2015.
 */

public class Bug58803Query {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit");

    static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] a) throws Exception {

        int updateCount = entityManager.createNamedQuery("user").setParameter("username", "blah").executeUpdate();

    }
}
