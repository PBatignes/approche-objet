/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/**Classe de test
 * 
 * @author Pierre
 *
 */
public class TestIntervenant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Salarie s = new Salarie("Dupont", "Marc", 1500.0);
		s.afficherDonnees();
		
		Pigiste p = new Pigiste("Duprés", "Jean", 150);
		p.afficherDonnees();

	}

}
