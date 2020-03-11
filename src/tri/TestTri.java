/**
 * 
 */
package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pierre
 *
 */
public class TestTri {
	
	public static void main(String[] args) {
		
		List<Pays> list = new ArrayList<>();
		list.add(new Pays("USA", 328_239_523, 59_495));
		list.add(new Pays("France", 67_795_000, 43_551));
		list.add(new Pays("Allemagne", 83_073_100, 50_206));
		list.add(new Pays("UK", 65_761_117, 43_620));
		list.add(new Pays("Italie", 60_483_973, 37_970));
		list.add(new Pays("Japon", 125_507_472, 42_659));
		list.add(new Pays("Chine", 1_417_913_092, 16_624));
		list.add(new Pays("Russie", 146_780_700, 27_900));
		list.add(new Pays("Inde", 1_296_834_042, 5_174));
		
		Collections.<Pays>sort(list);
		System.out.println(list);
		
		Collections.sort(list, new ComparatorHabitant());
		System.out.println(list);
		
		Collections.sort(list, new ComparatorPibHabitant());
		System.out.println(list);
		
	}

}
