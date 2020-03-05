/**
 * 
 */
package fr.diginamic.maison;

/**Représentation d'une piece
 *
 * @author Pierre
 *
 */
public abstract class Piece {
	
	/** superficie */
	private double superficie;
	
	/** etage */
	private int etage;

	/**Constructor
	 *
	 * @param superficie
	 * @param etage
	 */
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}

	/**Getter
	 *
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**Setter
	 *
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**Getter
	 *
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}

	/**Setter
	 *
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}

}
