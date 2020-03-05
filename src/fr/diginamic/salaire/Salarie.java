/**
 * 
 */
package fr.diginamic.salaire;

/**Représentation d'un salarié
 * 
 * @author Pierre
 *
 */
public class Salarie extends Intervenant {
	
	/** salaire Mensuel */
	private double salaireMens;

	/**Constructor
	 *
	 * @param salaire
	 */
	public Salarie(String nom, String prenom, double salaireMens) {
		super(nom, prenom);
		this.salaireMens = salaireMens;
	}

	/**Getter
	 *
	 * @return the salaireMens
	 */
	public double getSalaireMens() {
		return salaireMens;
	}

	/**Setter
	 *
	 * @param salaireMens the salaireMens to set
	 */
	public void setSalaireMens(double salaireMens) {
		this.salaireMens = salaireMens;
	}

	@Override
	public double getSalaire() {
		return salaireMens;
	}
	
	@Override
	public void afficherDonnees() {
		
		super.afficherDonnees();
		System.out.println("Rémunération mensuelle : " + this.salaireMens + "\nStatus : " 
				+ this.getClass().getSimpleName());
		
	}

}
