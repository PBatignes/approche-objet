package fr.diginamic.banque.entites;

/**Repésentation d'une opération banquaire
 * 
 * @author Pierre
 *
 */
public abstract class Operation {
	
	/** Date de l'opération */
	private String date;
	
	/** Montant de l'opération */
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
		return "Date de l'opération : " + date + "\nMontant de l'opération : " + montant;
	}
	
	public abstract void afficherType();
	
	public abstract String getType();

}
