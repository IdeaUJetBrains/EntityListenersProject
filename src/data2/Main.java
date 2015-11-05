package data2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistenceUnit");

    static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] a) throws Exception {
        entityManager.getTransaction().begin();


        Employee emp = new Employee();

        emp.setId(1);

        entityManager.persist(emp);


        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        Helper.checkData();
    }
}
