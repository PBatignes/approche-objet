package fr.diginamic.banque.entites;

/**
 * @author pierr
 *
 */
public class Compte {
	
	private int numCompte;
	private int soldeCompte;
	
	/**Constructor
	 * 
	 * @param numCompte 
	 * @param soldeCompte
	 */
	public Compte(int numCompte, int soldeCompte) {
		super();
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	/**
	 * @return numCompte
	 */
	public int getNumCompte() {
		return numCompte;
	}

	/**
	 * @param numCompte
	 */
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	/**
	 * @return soldeCompte
	 */
	public int getSoldeCompte() {
		return soldeCompte;
	}

	/**
	 * @param soldeCompte
	 */
	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	
	

}
