package fr.diginamic.banque.entites;

/**Représentation d'un opération de débit
 * 
 * Hérite de la classe Opération
 * 
 * @author Pierre
 *
 */
public class Debit extends Operation {
	
	/**Constructor
	 *
	 * @param date		Date du débit
	 * @param montant	Montant du débit
	 */
	public Debit(String date, int montant) {
		super(date, montant);
	}

	@Override
	public void afficherType() {
		System.out.println("Debit");
		
	}

	@Override
	public String getType() {
		return "Debit";
	}

}
