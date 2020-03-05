/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**Classe de test
 * 
 * @author Pierre
 *
 */
public class TestOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(Operations.calcul(5, 10, '+'));
		System.out.println(Operations.calcul(50, 15, '-'));
		System.out.println(Operations.calcul(4, 5, '*'));
		System.out.println(Operations.calcul(10, 2, '/'));

	}

}
