/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Pierre
 *
 */
public class MapPays {
	
	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Integer minPop = Integer.MAX_VALUE;
		Map<String, Integer> mapPays = new HashMap<>();
		mapPays.put("USA", 328_239_523);
		mapPays.put("France", 67_795_000);
		mapPays.put("Allemagne", 83_073_100);
		mapPays.put("UK", 65_761_117);
		mapPays.put("Italie", 60_483_973);
		mapPays.put("Japon", 125_507_472);
		mapPays.put("Chine", 1_417_913_092);
		mapPays.put("Russie", 146_780_700);
		mapPays.put("Inde", 1_296_834_042);
		
		//Supprimer le pays ayant le moins d'habitant
		Iterator<Integer> paysIt = mapPays.values().iterator();
		while (paysIt.hasNext()) {
			
			Integer paysPop = paysIt.next();
			if (minPop > paysPop) {
				
				minPop = paysPop;
				
			}
			
		}
		mapPays.remove(getKey(mapPays, minPop));
		
		//Affiche l’ensemble des pays restants
		System.out.println(mapPays);
		
	}

}
