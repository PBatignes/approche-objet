package fr.diginamic.banque.entites;

/**
 * @author pierre
 *
 */
public class CompteTaux extends Compte {
	
	private int tauxRem;

	/**Constructor
	 * 
	 * @param numCompte
	 * @param soldeCompte
	 * @param tauxRem
	 */
	public CompteTaux(int numCompte, int soldeCompte, int tauxRem) {
		super(numCompte, soldeCompte);
		this.tauxRem = tauxRem;
	}

	/**
	 * @return tauxRem
	 */
	public int getTauxRem() {
		return tauxRem;
	}

	/**
	 * @param tauxRem
	 */
	public void setTauxRem(int tauxRem) {
		this.tauxRem = tauxRem;
	}

	/**Override function toString()
	 * 
	 * @return String of the information of CompteTaux implementation
	 *
	 */
	@Override
	public String toString() {
		return super.toString() + "\nTaux de rémunération : " + tauxRem;
	}
	
	

}
