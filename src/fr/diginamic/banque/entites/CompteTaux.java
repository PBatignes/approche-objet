package fr.diginamic.banque.entites;

/**Repr�sentation d'un compte avec taux de r�mun�ration
 * 
 * H�rite de la classe Compte
 * 
 * @author Pierre
 *
 */
public class CompteTaux extends Compte {
	
	private int tauxRem;

	/**Constructor
	 * 
	 * @param numCompte		Num�ro de compte
	 * @param soldeCompte	Solde du compte
	 * @param tauxRem		Taux de r�mun�ration
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
		return super.toString() + "\nTaux de r�mun�ration : " + tauxRem;
	}
	
	

}
