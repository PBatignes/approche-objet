package entites;

/**Repr�sentation d'une adresse postale
 * 
 * @author Pierre
 *
 */
public class AdressePostale {

	/** Num�ro de la rue */
	public int numRue;
	
	/** Libel� de la rue */
	public String libeleRue;
	
	/** Code postal */
	public int codePostal;
	
	/** Ville */
	public String ville;
	
	/**Constructor
	 *
	 * @param numRue      	Num�ro de la rue
	 * @param libeleRue  	Libel� de la rue
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
