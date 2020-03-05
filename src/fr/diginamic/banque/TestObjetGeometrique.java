/**
 * 
 */
package fr.diginamic.banque;

import fr.diginamic.banque.entites.Cercle;
import fr.diginamic.banque.entites.ObjetGeometrique;
import fr.diginamic.banque.entites.Rectangle;

/**Classe de test des formes g�om�triques
 * 
 * @author Pierre
 *
 */
public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] objets = new ObjetGeometrique[2];
		
		objets[0] = new Cercle(5);
		objets[1] = new Rectangle(5, 10);
		
		for (int i = 0; i < objets.length; i++) {
			
			System.out.println("\nP�rim�tre du " + objets[i].getClass().getSimpleName() 
					+ " : " + objets[i].perimetre() + "\nSurface du " + objets[i].getClass().getSimpleName() +
					" : " + objets[i].surface());
			
		}

	}

}
