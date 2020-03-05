/**
 * 
 */
package fr.diginamic.formes;

/**Représentation d'un carré
 * 
 * @author Pierre
 *
 */
public class Carre extends Rectangle {
	
	/** longueur */
	private double longueur;

	/**Constructor
	 *
	 * @param longueur
	 */
	public Carre(double longueur) {
		super(longueur, longueur);
	}

	/**Getter
	 *
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**Setter
	 *
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

}
