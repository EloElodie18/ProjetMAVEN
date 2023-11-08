package Veille1;
import static org.junit.jupiter.api.Assertions.*; /*retrouver l'utilité et comment c'est arrivé là.....*/

import org.junit.jupiter.api.Test;

class TestHomer { /*pr instansier les tests*/

	@Test
	void testDrink() { 
		HomerSimpson.drinkBeer().contains("duff");/*pr utiliser .contains je dois changer ma manière de positionner mes données*/
		/*assertEquals("I love Duff", HomerSimpson.drinkBeer()) -> fonctionne seulement avec la phrase complete et 
		 * non pas un élément de la phrase;*/ 
	}

	@Test
	void testEat() {
		HomerSimpson.eat().contains("donuts");
	}
}
