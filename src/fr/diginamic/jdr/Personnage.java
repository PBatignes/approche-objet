/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

/**
 *
 * @author Pierre
 *
 */
public class Personnage {
	
	/** force */
	private int force;
	
	/** pv */
	private int pv;
	
	/** score */
	private int score;

	/**Constructor
	 *
	 * @param force
	 * @param pv
	 * @param score
	 */
	public Personnage() {
		super();
		this.force = new Random().nextInt(7) + 12;
		this.pv = new Random().nextInt(31) + 20;
		this.score = 0;
	}

	/**Getter
	 *
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/**Setter
	 *
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**Getter
	 *
	 * @return the pv
	 */
	public int getPv() {
		return pv;
	}

	/**Setter
	 *
	 * @param pv the pv to set
	 */
	public void setPv(int pv) {
		this.pv = pv;
	}

	/**Getter
	 *
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**Setter
	 *
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	public void afficherScore() {
		
		System.out.println("Vous etes mort, votre score et de : " + this.getScore());
		
	}

}
