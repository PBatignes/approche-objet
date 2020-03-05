/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

/**
 *
 * @author Pierre
 *
 */
public class TestMaison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Maison m = new Maison();
		
		Salon salon = new Salon(40.0, 0);
		m.ajouterPiece(salon);
		
		Chambre ch = new Chambre(15.0, 0);
		m.ajouterPiece(ch);
		
		Cuisine cu = new Cuisine(10.0, 1);
		m.ajouterPiece(cu);
		
		SalleDeBain sdb = new SalleDeBain(10.0, 1);
		m.ajouterPiece(sdb);
		
		Wc wc = new Wc(5.0, 2);
		m.ajouterPiece(wc);
		
		System.out.println("Superficie totale : " + m.getSuperficieTotale());
		System.out.println("Superficie 1er etage : " + m.getSuperficieParEtage(1));

	}

}
