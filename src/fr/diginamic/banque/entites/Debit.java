package fr.diginamic.banque.entites;

/**Repr�sentation d'un op�ration de d�bit
 * 
 * H�rite de la classe Op�ration
 * 
 * @author Pierre
 *
 */
public class Debit extends Operation {
	
	/**Constructor
	 *
	 * @param date		Date du d�bit
	 * @param montant	Montant du d�bit
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
