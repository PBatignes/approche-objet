/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Pierre
 *
 */
public class CreationEtManipulationMap {

	public static void main(String args[]) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		//Ajout dans mapVilles les informations pour Lille, Lyon et Bordeaux 
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//Boucle pour afficher l'ensemble des clés contenues dans la map
		Iterator<Integer> keyIt = mapVilles.keySet().iterator();
		while (keyIt.hasNext()) {
			
			System.out.println(keyIt.next());
			
		}
		
		System.out.println("--------------------------------------------");
		
		//Boucle pour afficher l'ensemble des valeurs contenues dans la map
		Iterator<String> valueIt = mapVilles.values().iterator();
		while (valueIt.hasNext()) {
			
			System.out.println(valueIt.next());
			
		}
		
		//Affiche la taille de la map
		System.out.println("--------------------------------------------");
		System.out.println("La taille de la map est : " + mapVilles.size());
	}
}
