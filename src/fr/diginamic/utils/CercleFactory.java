/**
 * 
 */
package fr.diginamic.utils;

import fr.diginamic.banque.entites.Cercle;

/**Classe de construction d'un cercle
 * 
 * @author Pierre
 *
 */
public class CercleFactory {
	
	public static Cercle factory(double rayon) {
		
		return new Cercle(rayon);
		
	}

}
