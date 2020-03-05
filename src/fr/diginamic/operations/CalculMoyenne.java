/**
 * 
 */
package fr.diginamic.operations;

import java.util.ArrayList;
import java.util.List;

/**Classe de calcul de moyenne
 * 
 * @author Pierre
 *
 */
public class CalculMoyenne {
	
	/** Liste de toutes les valeur à calculer */
	private List<Double> list = new ArrayList<Double>();

	/**Constructor
	 *
	 */
	public CalculMoyenne() {
		super();
	}
	
	public void ajout(double var) {
		
		list.add(var);
		
	}
	
	public double calcul() {
		
		double total = 0;
		for (Double val : list) {
			
			total += val;
			
		}
		return total / list.size();
		
	}

}
