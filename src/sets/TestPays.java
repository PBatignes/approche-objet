/**
 * 
 */
package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Pierre
 *
 */
public class TestPays {

	public static void main(String[] args) {

		Pays maxPib = null;
		Pays maxPibTotal = null;
		Pays minPib = null;
		Set<Pays> set = new HashSet<>();
		set.add(new Pays("USA", 328_239_523, 59_495));
		set.add(new Pays("France", 67_795_000, 43_551));
		set.add(new Pays("Allemagne", 83_073_100, 50_206));
		set.add(new Pays("UK", 65_761_117, 43_620));
		set.add(new Pays("Italie", 60_483_973, 37_970));
		set.add(new Pays("Japon", 125_507_472, 42_659));
		set.add(new Pays("Chine", 1_417_913_092, 16_624));
		set.add(new Pays("Russie", 146_780_700, 27_900));
		set.add(new Pays("Inde", 1_296_834_042, 5_174));

		// Recherche le pays avec le PIB/habitant le plus important
		Iterator<Pays> it = set.iterator();
		while (it.hasNext()) {

			if (maxPib == null || maxPib.getPib() < it.next().getPib()) {

				maxPib = it.next();

			}

		}
		System.out.println(".");

		// Recherche le pays avec le PIB total le plus important
		Iterator<Pays> it2 = set.iterator();
		while (it2.hasNext()) {

			if (maxPibTotal == null || 
				maxPibTotal.getPib() * maxPibTotal.getNbHab() < it2.next().getPib() 
				* it2.next().getNbHab()) {

				maxPibTotal = it2.next();

			}

		}
		System.out.println(".");
		
		//Modifie le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le 
		//plus petit 
		Iterator<Pays> it3 = set.iterator();
		while (it3.hasNext()) {

			if (minPib == null || 
					minPib.getPib() * minPib.getNbHab() > it3.next().getPib() 
				* it3.next().getNbHab()) {

//				minPib = it3.next();

			}

		}
		System.out.println(".");
		
		set.remove(minPib);
		set.add(new Pays(minPib.getNom().toUpperCase(), minPib.getNbHab(), minPib.getPib()));
		
		System.out.println(set);

	}

}
