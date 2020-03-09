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
public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		int max = list.get(0);
		int min = list.get(0);

		System.out.println("Elements de la liste : ");

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}
		

		System.out.println("\nTaille de la liste : " + list.size());
		

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) > max) {

				max = list.get(i);

			}

		}

		System.out.println("\nPlus grand element de la liste : " + max);
		

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) < min) {

				min = list.get(i);

			}

		}

		System.out.println("\nPlus petit element de la liste : " + min);
		
		
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) < 0) {

				list.set(i, Math.abs(list.get(i)));

			}

		}
		
		System.out.println("\nElements de la liste : ");
		
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

	}

}
