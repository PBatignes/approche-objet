package fr.diginamic.banque.entites;

/**Représentation d'un compte banquaire
 * 
 * @author Pierre
 *
 */
public class Compte {
	
	/** Numéro de compte */
	private Integer numCompte;
	
	/** Solde du compte */
	private Double soldeCompte;
	
	/**Constructor
	 * 
	 * @param numCompte		Numéro deu compte
	 * @param soldeCompte	Solde du compte
	 */
	public Compte(int numCompte, double soldeCompte) {
		super();
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	/**Getter
	 * 
	 * @return numCompte
	 */
	public Integer getNumCompte() {
		return numCompte;
	}

	/**Setter
	 * 
	 * @param numCompte
	 */
	public void setNumCompte(Integer numCompte) {
		this.numCompte = numCompte;
	}

	/**Getter
	 * 
	 * @return soldeCompte
	 */
	public Double getSoldeCompte() {
		return soldeCompte;
	}

	/**Setter
	 * 
	 * @param soldeCompte
	 */
	public void setSoldeCompte(Double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	
	/**Override of the toString method
	 *
	 */
	@Override
	public String toString() {
		return "Numéro du compte : " + numCompte + "\nSolde du compte : " + soldeCompte;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Compte)) {
			
			return false;
			
		} else {
			
			Compte cpt = (Compte) obj;
			return numCompte.equals(cpt.getNumCompte()) && soldeCompte.equals(cpt.getSoldeCompte());
		}
		
	}

}
