package fr.diginamic.banque.entites;

/**Représentation d'un compte avec taux de rémunération
 * 
 * Hérite de la classe Compte
 * 
 * @author Pierre
 *
 */
public class CompteTaux extends Compte {
	
	private int tauxRem;

	/**Constructor
	 * 
	 * @param numCompte		Numéro de compte
	 * @param soldeCompte	Solde du compte
	 * @param tauxRem		Taux de rémunération
	 */
	public CompteTaux(int numCompte, int soldeCompte, int tauxRem) {
		super(numCompte, soldeCompte);
		this.tauxRem = tauxRem;
	}

	/**Getter
	 * 
	 * @return tauxRem
	 */
	public int getTauxRem() {
		return tauxRem;
	}

	/**Setter
	 * 
	 * @param tauxRem
	 */
	public void setTauxRem(int tauxRem) {
		this.tauxRem = tauxRem;
	}

	
	@Override
	public String toString() {
		return super.toString() + "\nTaux de rémunération : " + tauxRem;
	}
	
	

}
