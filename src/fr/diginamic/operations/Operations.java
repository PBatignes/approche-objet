/**
 * 
 */
package fr.diginamic.operations;

/**Repr�sentation d'une op�ration
 * 
 * @author Pierre
 *
 */
public class Operations {
	
	public static double calcul(double a, double b, char opp) {
		
		switch (opp) {
		case '+': {
			return a + b;
		}
		case '-': {
			return a - b;
		}
		case '*': {
			return a * b;
		}
		case '/': {
			return a / b;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opp);
		}
		
	}

}
