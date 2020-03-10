/**
 * 
 */
package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Pierre
 *
 */
public class TestSetString {

	public static void main(String[] args) {
		
		String max = "";
		Set<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			
			if (max.length() < it.next().length()) {
				
				max = it.next();
				
			}
			
		}
		
		set.remove(max);
		
		System.out.println(set);
		
	}
	
}
