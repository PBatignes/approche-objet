/**
 * 
 */
package fr.diginamic.salaire;

/**Représentation d'un pigiste
 * 
 * @author Pierre
 *
 */
public class Pigiste extends Intervenant {
	
	/** salaire Journalier */
	private double salaireJourn;

	/**Constructor
	 *
	 * @param salaireJourn
	 */
	public Pigiste(String nom, String prenom, double salaireJourn) {
		super(nom, prenom);
		this.salaireJourn = salaireJourn;
	}

	/**Getter
	 *
	 * @return the salaireJourn
	 */
	public double getSalaireJourn() {
		return salaireJourn;
	}

	/**Setter
	 *
	 * @param salaireJourn the salaireJourn to set
	 */
	public void setSalaireJourn(double salaireJourn) {
		this.salaireJourn = salaireJourn;
	}

	@Override
	public double getSalaire() {
		return salaireJourn;
	}
	
	@Override
	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println("Rémunération journalière : " + this.salaireJourn+ "\nStatus : " 
				+ this.getClass().getSimpleName());
	}

}
