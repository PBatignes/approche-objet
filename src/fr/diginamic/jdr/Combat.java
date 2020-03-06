/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

import fr.diginamic.jdr.creatures.Creature;

/**
 *
 * @author Pierre
 *
 */
public class Combat {
	
	public static void combat(Personnage p, Creature cret) throws InterruptedException {
		
		while (cret.getPv() > 0) {
			
			attaque(p, cret);
			p.getClass().wait();
			
		}
		
	}
	
	public static void attaque(Personnage p1, Creature p2) {
		
		int attackP1 = p1.getForce() + new Random().nextInt(10) + 1;
		int attackP2 = p2.getForce() + new Random().nextInt(10) + 1;
		
		if (attackP1 > attackP2) {
			
			System.out.println("\nLe joueur à une plus grande force.\n" + 
								p2.getClass().getSimpleName() + " subit " + (attackP1 - attackP2) + 
									" point de dégat");
			p2.setPv(p2.getPv() - (attackP1 - attackP2));
			
		} else if (attackP1 < attackP2) {
			
			System.out.println("\n" + p2.getClass().getSimpleName() + " à une plus grande force.\n" + 
								"Joueur subit " + (attackP2 - attackP1) + " point de dégat");
			p1.setPv(p1.getPv() - (attackP2 - attackP1));
			
		} else {
			
			System.out.println("Vous ètes de force égale, alors rien ne se passe");
			
		}
		
	}

}
