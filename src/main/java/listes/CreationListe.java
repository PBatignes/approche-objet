/**
 * 
 */
package listes;

import java.util.ArrayList;

/**
 *
 * @author Pierre
 *
 */
public class CreationListe {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 100; i++) {
			
			list.add(i);
			
		}
		
		System.out.println("Taille de la liste : " + list.size());

	}

}