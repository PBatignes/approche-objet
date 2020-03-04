package fr.diginamic.banque.entites;

/**Rep�sentation d'une op�ration banquaire
 * 
 * @author Pierre
 *
 */
public abstract class Operation {
	
	/** Date de l'op�ration */
	private String date;
	
	/** Montant de l'op�ration */
	private int montant;
	
	/**Constructor
	 * 
	 * @param date
	 * @param montant
	 */
	public Operation(String date, int montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	/**Getter
	 * 
	 * @return date
	 */
	public String getDate() {
		return date;
	}

	/**Setter
	 * 
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**Getter
	 * 
	 * @return montant
	 */
	public int getMontant() {
		return montant;
	}

	/**Setter
	 * 
	 * @param montant
	 */
	public void setMontant(int montant) {
		this.montant = montant;
	}
	
	/**Override of the toString method
	 *
	 */
	@Override
	public String toString() {
		return "Date de l'op�ration : " + date + "\nMontant de l'op�ration : " + montant;
	}
	
	public abstract void afficherType();
	
	public abstract String getType();

}
