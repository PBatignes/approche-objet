/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pierre
 *
 */
public class TestVille {
	
	public static void main(String[] args) {
		
		List<Ville> list = new ArrayList<Ville>();
		int maxNbHab = 0;
		int minNbHab = 0;
		
		list.add(new Ville("Nice", 343_000));
		list.add(new Ville("Carcassonne", 47_800));
		list.add(new Ville("Narbonne", 53_400));
		list.add(new Ville("Lyon", 484_000));
		list.add(new Ville("Foix", 9_700));
		list.add(new Ville("Pau", 77_200));
		list.add(new Ville("Marseille", 850_700));
		list.add(new Ville("Tarbes", 40_600));
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).getNbHab() > list.get(maxNbHab).getNbHab()) {
				
				maxNbHab = i;
				
			} else if (list.get(i).getNbHab() < list.get(minNbHab).getNbHab()) {
				
				minNbHab = i;
				
			}
			
		}
		
		System.out.println("La ville la plus peuplé est : " + list.get(maxNbHab).getNom());
		
		list.remove(minNbHab);
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).getNbHab() > 100_000) {
				
				list.get(i).setNom(list.get(i).getNom().toUpperCase());
				
			}
			
		}
		
		System.out.println("\nElements de la liste : ");
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i).getNom() + ", " + list.get(i).getNbHab());
			
		}
		
	}

}
