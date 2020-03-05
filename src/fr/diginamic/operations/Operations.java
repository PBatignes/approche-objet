/**
 * 
 */
package fr.diginamic.operations;

/**Représentation d'une opération
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
