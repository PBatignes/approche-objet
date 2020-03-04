package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

/**
 * 
 * @author pierre
 *
 */
public class TestBanque {
	
	public static void main(String[] args) {
		
		Compte c = new Compte(100254, 10000);
		
		System.out.println(c);
		
	}

}
