/**
 * 
 */
package fr.diginamic.jdr.creatures;

import java.util.Random;

import fr.diginamic.jdr.Personnage;

/**
 *
 * @author Pierre
 *
 */
public class Loup extends Creature {

	public Loup() {
		super(new Random().nextInt(6) + 3, new Random().nextInt(6) + 5);
	}
	
	@Override
	public void mort(Personnage p) {

		p.setScore(p.getScore() + 1);
		
	}

}
