package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**Classe de test
 * 
 * @author Pierre
 *
 */
public class TestBanque {
	
	public static void main(String[] args) {
		
		Compte c = new Compte(100254, 10000);
		CompteTaux ct = new CompteTaux(154896, 50000, 5000);
		
		Compte[] array = new Compte[2];
		array[0] = c;
		array[1] = ct;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i] + "\n");
			
		}
		
		Compte compte1 = new Compte(123456, 1000.0);
		Compte compte2 = new Compte(123456, 1000.0);
		
		System.out.println(compte1.equals(compte2));
		
		Compte compte3 = compte2;
		System.out.println(compte2.equals(compte3));
		
	}

}
