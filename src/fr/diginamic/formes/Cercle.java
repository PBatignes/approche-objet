/**
 * 
 */
package fr.diginamic.formes;

/**Représentation d'un cercle
 * 
 * @author Pierre
 *
 */
public class Cercle extends Forme{
	
	/** rayon */
	private double rayon;

	/**Constructor
	 *
	 * @param rayon du cercle
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	/**Getter
	 *
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**Setter
	 *
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		return 2 * Math.PI * rayon;
	}

	@Override
	public double calculerPerimetre() {
		return Math.pow(rayon, 2) * Math.PI;
	}

}
