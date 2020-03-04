package entites;

/**Représentation d'une adresse postale
 * 
 * @author Pierre
 *
 */
public class AdressePostale {

	/** Numéro de la rue */
	public int numRue;
	
	/** Libelé de la rue */
	public String libeleRue;
	
	/** Code postal */
	public int codePostal;
	
	/** Ville */
	public String ville;
	
	/**Constructor
	 *
	 * @param numRue      	Numéro de la rue
	 * @param libeleRue  	Libelé de la rue
	 * @param codePostal  	Code postal
	 * @param ville			Ville
	 */
	public AdressePostale (int numRue, String libeleRue, int codePostal, String ville) {
		
		this.numRue = numRue;
		this.libeleRue = libeleRue;
		this.codePostal = codePostal;
		this.ville = ville;
		
	}

}
