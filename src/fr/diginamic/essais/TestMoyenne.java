/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**Classe de test
 * 
 * @author Pierre
 *
 */
public class TestMoyenne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CalculMoyenne cm1 = new CalculMoyenne();
		CalculMoyenne cm2 = new CalculMoyenne();
		
		cm1.ajout(10.0);
		cm1.ajout(5.0);
		cm1.ajout(100.0);
		cm1.ajout(4.0);
		
		cm2.ajout(4.0);
		cm2.ajout(40.0);
		cm2.ajout(20.0);
		cm2.ajout(10.0);
		
		System.out.println(cm1.calcul());
		System.out.println(cm2.calcul());

	}

}
