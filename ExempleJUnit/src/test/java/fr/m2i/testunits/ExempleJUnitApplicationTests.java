package fr.m2i.testunits;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.m2i.testunits.domain.AutreClass;
import fr.m2i.testunits.domain.MaClassExemple;
import fr.m2i.testunits.model.Autre;
import fr.m2i.testunits.model.User;

@SpringBootTest
class ExempleJUnitApplicationTests {

	MaClassExemple exemple;
	
	@Test
	void contextLoads() {
	}
	
	
	
	@BeforeEach
	public void avantChaqueTest() {
		exemple = new MaClassExemple();
		System.out.println("Je démarre un test....");
	}
	
	
	@AfterEach
	public void apresChaqueTest() {
		exemple = new MaClassExemple();
		System.out.println("Je termine un test...");
	}
	
	
	@Test
	public void sayHelloTest() {
		//Arrange
	
		
		//Act
		
		String result = exemple.sayHello();
		
		
		//Assert
		assertEquals("Hello, the world!", result);
	
	
	}
	
	
	
	@Test
	public void sayByeTest() {
		
		//Arrange
		AutreClass exemple = new AutreClass();
		
		
		
		//Act
		
		String result = exemple.sayBye();
		
		
		//Assert
		assertEquals("Bye", result);
		
		
	}
	
	
	@Test
	public void addTest() {
		//Arrange
		int a = 1;
		int b = 1;
		
		//Act
		int result = a + b;
		
		//Assert
		assertEquals(2,result);
		
	}
	
	
	
	
	
	
	
	/*
	 * Programme
	 * 
	 * Avec une classe Utilisateur => attr(nom, prenom)
	 * 
	 * Vous devez tester l'égalité d'état entre deux instances de Utilisateur (quand ils ont le même nom et même prenom)
	 * 
	 * 
	 */
	
	
	/*
	 * Programme calculatrice
	 * add
	 * sous
	 * div
	 * multiplication
	 * factorielle
	 * 
	 * Vous tester chaque methode
	 * 
	 * 
	 * Ce projet doit être creer en utilisant la méthode TDD
	 * Au moins une fixture
	 * 
	 */
	
	
	
	
	
	

}
