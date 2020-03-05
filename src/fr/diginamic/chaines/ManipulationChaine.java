/**
 * 
 */
package fr.diginamic.chaines;

import fr.diginamic.banque.entites.Client;
import fr.diginamic.banque.entites.Compte;

/**Classe de manipulation de chaines
 * 
 * @author Pierre
 *
 */
public class ManipulationChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		char premierCaractere = chaine.charAt(0);  
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Taille de la chaine : " + chaine.length());
		System.out.println("Index du premier ';' : " + chaine.indexOf(";"));
		
		String nom = chaine.substring(0, chaine.indexOf(";"));
		System.out.println("\n" +nom.toUpperCase());
		System.out.println(nom.toLowerCase() + "\n");
		
		String[] tabChaine = chaine.split(";");
		for (String s : tabChaine) {
			
			System.out.println(s);
			
		}
		
		double i = 158_15.5;
		
		Client client = new Client(tabChaine[0], tabChaine[1]);
		Compte compte = new Compte(Integer.parseInt(tabChaine[2]), Double.parseDouble(tabChaine[3].replace(" ", "")));
		

	}

}
