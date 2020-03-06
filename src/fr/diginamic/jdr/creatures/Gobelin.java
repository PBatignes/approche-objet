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
public class Gobelin extends Creature {
	
	public Gobelin() {
		super(new Random().nextInt(6) + 5, new Random().nextInt(6) + 10);
	}
	
	@Override
	public void mort(Personnage p) {

		p.setScore(p.getScore() + 2);
		
	}

}
