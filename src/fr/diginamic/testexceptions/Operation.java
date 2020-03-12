/**
 * 
 */
package fr.diginamic.testexceptions;

/**
 *
 * @author Pierre
 *
 */
public class Operation {
	
	public static double diviser(double a, double b) throws Exception {
		
		if (b == 0) {
			
			throw new Exception("Division par zéro impossible");
			
		} else {
			
			return a/b;
			
		}
		
	}
	
	public static double diviserRuntime(double a, double b) throws RuntimeException {
		
		if (b == 0) {
			
			throw new RuntimeException();
			
		} else {
			
			return a/b;
			
		}
		
	}

}
