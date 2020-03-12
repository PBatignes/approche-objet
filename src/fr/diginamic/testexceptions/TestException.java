/**
 * 
 */
package fr.diginamic.testexceptions;

/**
 *
 * @author Pierre
 *
 */
public class TestException {

	public static void main(String[] args) {

		try {
			System.out.println(Operation.diviser(4, 2));

			System.out.println(Operation.diviser(5, 0));
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
