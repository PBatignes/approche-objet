/**
 * 
 */
package fr.diginamic.formes;

/**Représentation d'un rectangle
 * 
 * @author Pierre
 *
 */
public class Rectangle extends Forme {
	
	/** longueur */
	private double longueur;
	
	/** largeur */
	private double largeur;

	/**Constructor
	 *
	 * @param longueur du rectangle
	 * @param largeur  du rectangle
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
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

	/**Getter
	 *
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**Setter
	 *
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return longueur * largeur;
	}

	@Override
	public double calculerPerimetre() {
		return (longueur + largeur) * 2;
	}

	

}
