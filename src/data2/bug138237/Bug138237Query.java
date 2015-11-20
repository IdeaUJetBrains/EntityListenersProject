package data2.bug138237;

import data2.Helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Created by Olga Pavlova on 11/9/2015.
 */

public class Bug138237Query {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit");

    static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] a) throws Exception {
        entityManager.getTransaction().begin();

        Query query = null;
        query = entityManager.createQuery("select distinct lv.class from LookupValue lv");



        entityManager.close();
        entityManagerFactory.close();

        Helper.checkData();
    }
}
