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
public class Troll extends Creature {
	
	public Troll() {
		super(new Random().nextInt(6) + 10, new Random().nextInt(11) + 20);
	}
	
	@Override
	public void mort(Personnage p) {

		p.setScore(p.getScore() + 5);
		
	}

}
