package demoMaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloClassTest {
	
	@BeforeEach
	void setUp() {
		System.out.println("Test commence! ");
		}

	
	@Test 
	void testHello() {
		
		assertEquals(4,4,"Doit retourner la surface d'un carré.");
	}


}
