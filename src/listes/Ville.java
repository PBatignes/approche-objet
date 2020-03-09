/**
 * 
 */
package listes;

/**
 *
 * @author Pierre
 *
 */
public class Ville {
	
	/** nom */
	private String nom;
	
	/** nombre d'habitant */
	private int nbHab;

	/**Constructor
	 *
	 * @param nom
	 * @param nbHab
	 */
	public Ville(String nom, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}

	/**Getter
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter
	 *
	 * @return the nbHab
	 */
	public int getNbHab() {
		return nbHab;
	}

	/**Setter
	 *
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}
	
	

}
