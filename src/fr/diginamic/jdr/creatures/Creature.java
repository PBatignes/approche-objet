/**
 * 
 */
package fr.diginamic.jdr.creatures;

import fr.diginamic.jdr.Personnage;

/**
 *
 * @author Pierre
 *
 */
public abstract class Creature {
	
	/** force */
	private int force;
	
	/** pv */
	private int pv;

	/**Constructor
	 *
	 * @param force
	 * @param pv
	 */
	public Creature(int force, int pv) {
		super();
		this.force = force;
		this.pv = pv;
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
	
	public abstract void mort(Personnage p);

}
