/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.banque.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

/**Classe de test
 * 
 * @author Pierre
 *
 */
public class TestCercle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cercle c1 = CercleFactory.factory(5.0);
		Cercle c2 = CercleFactory.factory(10.0);
		
		System.out.println(c1.perimetre() + "\n" + 
							c1.surface() + "\n" + 
							c2.perimetre() + "\n" + 
							c2.surface());

	}

}
