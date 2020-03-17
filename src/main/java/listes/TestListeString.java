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
public class TestListeString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");

		int plusGrand = 0;
		String ville = null;

		for (int i = 0; i < list.size(); i++) {

			if (plusGrand < list.get(i).length()) {

				plusGrand = list.get(i).length();
				ville = list.get(i);

			}

		}

		System.out.println("La ville avec le plus grand nombre de lettre est : " + ville);

		list.replaceAll(String::toUpperCase);

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).startsWith("N")) {

				list.remove(i);

			}

		}
		
		System.out.println("\nElement de la liste : ");
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}

	}

}
