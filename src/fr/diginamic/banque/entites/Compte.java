package fr.diginamic.banque.entites;

/**Repr�sentation d'un compte banquaire
 * 
 * @author Pierre
 *
 */
public class Compte {
	
	/** Num�ro de compte */
	private int numCompte;
	
	/** Solde du compte */
	private int soldeCompte;
	
	/**Constructor
	 * 
	 * @param numCompte		Num�ro deu compte
	 * @param soldeCompte	Solde du compte
	 */
	public Compte(int numCompte, int soldeCompte) {
		super();
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	/**Getter
	 * 
	 * @return numCompte
	 */
	public int getNumCompte() {
		return numCompte;
	}

	/**Setter
	 * 
	 * @param numCompte
	 */
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	/**Getter
	 * 
	 * @return soldeCompte
	 */
	public int getSoldeCompte() {
		return soldeCompte;
	}

	/**Setter
	 * 
	 * @param soldeCompte
	 */
	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	
	/**Override of the toString method
	 *
	 */
	@Override
	public String toString() {
		return "Num�ro du compte : " + numCompte + "\nSolde du compte : " + soldeCompte;
	}

}
