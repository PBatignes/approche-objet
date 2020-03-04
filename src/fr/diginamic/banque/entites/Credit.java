package fr.diginamic.banque.entites;


/**Repr�sentation d'un op�ration de cr�dit
 * 
 * H�rite de la classe Op�ration
 * 
 * @author Pierre
 *
 */
public class Credit extends Operation {

	/**Constructor
	 *
	 * @param date		Date du cr�dit
	 * @param montant	Montant du cr�dit
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
