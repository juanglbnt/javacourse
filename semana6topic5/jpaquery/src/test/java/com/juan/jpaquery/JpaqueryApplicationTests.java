package com.juan.jpaquery;

import com.juan.jpaquery.entities.Cocktail;
import com.juan.jpaquery.entities.MultipleRecipe;
import com.juan.jpaquery.entities.Recipe;
import com.querydsl.jpa.impl.JPAQuery;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootTest
class JpaqueryApplicationTests {

	private  static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static Cocktail mojito;
	private static Cocktail ginTonic;

	@BeforeAll
	public static void setUp() {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa-h2-unrelated-entities");
		entityManager = entityManagerFactory.createEntityManager();
		mojito = new Cocktail("mojito", 11, "rum");
		ginTonic = new Cocktail("Gin Tonic", 8.50, "Gin");
		entityManager.getTransaction().begin();
		entityManager.persist(mojito);
		entityManager.persist(ginTonic);
		entityManager.persist(new Recipe(mojito.getName(), "some instructions"));
		entityManager.persist(new MultipleRecipe(1L, mojito.getName(), "some instructions", mojito.getCategory()));
		entityManager.persist(new MultipleRecipe(2L, mojito.getName(), "some other instructions", mojito.getCategory()));
		entityManager.getTransaction().commit();
	}

	@AfterAll
	public static void closeSession() {
		entityManager.close();
	}

	@Test
	public void givenCocktailWithRecipe_WhenQuerying_thenTheExpectedCocktailsReturned() {
		//JPA
		Cocktail cocktail = entityManager.createQuery("select c "
						+ "from Cocktail c join c.recipe", Cocktail.class)
				.getSingleResult();
		verifyResult(mojito, cocktail);

		cocktail = entityManager.createQuery("select c "
						+ "from Cocktail c join Recipe r "
						+ "on c.name = r.cocktail", Cocktail.class)
				.getSingleResult();
		verifyResult(mojito, cocktail);

		//QUERYDSL
		/*cocktail = new JPAQuery<Cocktail>(entityManager).from(QCocktail.cocktail)
				.join((QCocktail.cocktail.recipe)
						.fetchOne());*/
	}
	private void verifyResult(Cocktail expectedCocktail, Cocktail queryResult) {
		Assertions.assertNotNull(queryResult);
		Assertions.assertEquals(expectedCocktail, queryResult);
	}

}
