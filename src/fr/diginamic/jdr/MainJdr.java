/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

import fr.diginamic.jdr.creatures.Creature;
import fr.diginamic.jdr.creatures.Gobelin;
import fr.diginamic.jdr.creatures.Loup;
import fr.diginamic.jdr.creatures.Troll;

/**
 *
 * @author Pierre
 *
 */
public class MainJdr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Personnage joueur = new Personnage();
		System.out.println("Votre personnage à : " + joueur.getForce() + " force et " 
				+ joueur.getPv() + " PV");
		
		Creature cret;
		
		while (joueur.getPv() > 0) {
			
			switch (new Random().nextInt(3)){
			case 0: {
				cret = new Loup();
				break;
			}
			case 1: {
				cret = new Gobelin();
				break;
			}
			case 2: {
				cret = new Troll();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value in the Random()");
			}
			
			while (cret.getPv() > 0) {
				
				Combat.attaque(joueur, cret);
				
				System.out.println("\nIl vous reste " + joueur.getPv() + "PV");
				System.out.println("Le " + cret.getClass().getSimpleName() + " à " + cret.getPv() + "PV");
				
				try {
		            Thread.sleep(5000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
			}
			
			System.out.println("Victoire contre " + cret.getClass().getSimpleName());
		}
		
		joueur.afficherScore();

	}

}
