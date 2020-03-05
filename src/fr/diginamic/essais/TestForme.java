package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {
	
	public static void main(String[] args) {
		
		Cercle cercle = new Cercle(10.0);
		Rectangle rect = new Rectangle(50.0, 25.0);
		Carre carre = new Carre(4.0);
		
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rect);
		AffichageForme.afficher(carre);
		
	}

}
