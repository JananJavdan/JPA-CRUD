package be.intecbrussel.notebooks.jpa.util;

import javax.persistence.*;

import be.intecbrussel.notebooks.jpa.entity.Student;



import javax.persistence.EntityManager;

public class CRUDOperations {

        public void insertEntity() {
            EntityManager entityManager =
                    JPAUtil.getEntityManagerFactory().createEntityManager();
            entityManager.getTransaction().begin();

            Student student = new Student("Rame","Fadatre","rames@javaguides.com");

            entityManager.persist(student);
            entityManager.getTransaction().commit();
            entityManager.close();
        }


    public void findEntity() {
        EntityManager entityManager =
                JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, 1);

        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void updateEntity() {
        EntityManager entityManager =
                JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, 1);

        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());

        // The entity object is physically updated in the database when the transaction
        // is committed
        student.setFirstName("Rame");
        student.setLastName("Fadatre");


        entityManager.getTransaction().commit();
        entityManager.close();
    }
    public void removeEntity() {
        EntityManager entityManager =
                JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, 1);

        System.out.println("student id :: " + student.getId());
        System.out.println("student firstname :: " + student.getFirstName());
        System.out.println("student lastname :: " + student.getLastName());
        System.out.println("student email :: " + student.getEmail());

        entityManager.getTransaction().commit();
        entityManager.close();
    }


}
