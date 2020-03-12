/**
 * 
 */
package fr.diginamic.testexceptions;

/**
 *
 * @author Pierre
 *
 */
public class TestRuntimeException {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(Operation.diviserRuntime(5, 2));
			System.out.println(Operation.diviserRuntime(5, 0));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
