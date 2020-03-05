/**
 * 
 */
package fr.diginamic.banque.entites;

/**Représente la forme géométrique du cercle
 * 
 * @author Pierre
 *
 */
public class Cercle implements ObjetGeometrique{
	
	/** Rayon du cercle */
	private double rayon;
	
	/**Constructor
	 *
	 * @param rayon	du cercle
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}

	@Override
	public double surface() {
		return Math.pow(rayon, 2) * Math.PI;
	}

}
