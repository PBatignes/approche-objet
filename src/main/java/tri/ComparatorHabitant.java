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
public class ComparatorHabitant implements  Comparator<Pays>{

	@Override
	public int compare(Pays p1, Pays p2) {
		//Compare du plus petit au plus grand
		return p1.getNbHab().compareTo(p2.getNbHab());
		
		//Compare du plus grand au plus petit
//		return p2.getNbHab().compareTo(p1.getNbHab());
	}

}
