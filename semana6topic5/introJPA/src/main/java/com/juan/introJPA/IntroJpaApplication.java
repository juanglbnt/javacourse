package com.juan.introJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootApplication
public class IntroJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(IntroJpaApplication.class, args);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		Student student = new Student("juan", "loaiza", "juanguillermo.loaiza@globant.com");
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
