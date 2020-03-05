/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**Affiche p�rimetre et surface des formes
 * 
 * @author Pierre
 *
 */
public class AffichageForme {

	public static void afficher(Forme f) {
		
		System.out.println("P�rim�tre du " + f.getClass().getSimpleName() + " : " + f.calculerPerimetre());
		System.out.println("Surface du " + f.getClass().getSimpleName() + " : " + f.calculerSurface());
		
	}

}
