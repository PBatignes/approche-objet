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
			Pays paysCourrant = it.next();
			if (maxPib == null || maxPib.getPib() < paysCourrant.getPib()) {

				maxPib = paysCourrant;

			}

		}
		System.out.println(maxPib);

		// Recherche le pays avec le PIB total le plus important
		it = set.iterator();
		while (it.hasNext()) {
			Pays paysCourrant = it.next();
			if (maxPibTotal == null || 
				maxPibTotal.getPibTotal() < paysCourrant.getPibTotal()) {

				maxPibTotal = paysCourrant;

			}

		}
		System.out.println(maxPibTotal);
		
		//Modifie le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le 
		//plus petit 
		it = set.iterator();
		while (it.hasNext()) {
			Pays paysCourrant = it.next();
			if (minPib == null || 
					minPib.getPibTotal() > paysCourrant.getPibTotal()) {

				minPib = paysCourrant;

			}

		}
		System.out.println(minPib);
		
		set.remove(minPib);
		set.add(new Pays(minPib.getNom().toUpperCase(), minPib.getNbHab(), minPib.getPib()));
		
		System.out.println(set);

	}

}
