/**
 * 
 */
package fr.diginamic.banque.entites;

/**Représente la forme géométrique du rectangle
 * 
 * @author Pierre
 *
 */
public class Rectangle implements ObjetGeometrique {
	
	/** longeur */
	private double longeur;
	
	/** largeur */
	private double largeur;
	
	/**Constructor
	 *
	 * @param longeur du rectangle
	 * @param largeur du rectangle
	 */
	public Rectangle(double longeur, double largeur) {
		this.longeur = longeur;
		this.largeur = largeur;
	}
	
	@Override
	public double perimetre() {
		return (longeur + largeur) * 2;
	}
	@Override
	public double surface() {
		return longeur * largeur;
	}

}
