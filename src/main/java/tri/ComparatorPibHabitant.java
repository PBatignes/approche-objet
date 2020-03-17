/**
 * 
 */
package tri;

import java.util.Comparator;

/**
 *
 * @author Pierre
 *
 */
public class ComparatorPibHabitant implements  Comparator<Pays>{

	@Override
	public int compare(Pays p1, Pays p2) {
		//Compare du plus petit au plus grand
		return p1.getPib().compareTo(p2.getPib());
		
		//Compare du plus grand au plus petit
//		return p2.getPib().compareTo(p1.getPib());
	}

}
