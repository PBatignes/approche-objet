/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**Affiche périmetre et surface des formes
 * 
 * @author Pierre
 *
 */
public class AffichageForme {

	public static void afficher(Forme f) {
		
		System.out.println("Périmètre du " + f.getClass().getSimpleName() + " : " + f.calculerPerimetre());
		System.out.println("Surface du " + f.getClass().getSimpleName() + " : " + f.calculerSurface());
		
	}

}
