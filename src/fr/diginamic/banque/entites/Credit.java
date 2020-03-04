package fr.diginamic.banque.entites;


/**Représentation d'un opération de crédit
 * 
 * Hérite de la classe Opération
 * 
 * @author Pierre
 *
 */
public class Credit extends Operation {

	/**Constructor
	 *
	 * @param date		Date du crédit
	 * @param montant	Montant du crédit
	 */
	public Credit(String date, int montant) {
		super(date, montant);
	}

	@Override
	public void afficherType() {
		System.out.println("Credit\n");
		
	}

	@Override
	public String getType() {
		return "Credit";
	}

}
