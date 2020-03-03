package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p1 = new Personne();
		p1.nom = "Batignes";
		p1.prenom = "Pierre";
		p1.adresse.numRue = 5;
		p1.adresse.libeleRue = "des jardin";
		p1.adresse.codePostal = 31540;
		p1.adresse.ville = "Saint Julia";
		
		Personne p2 = new Personne();
		p2.nom = "Jacque";
		p2.prenom = "Jean";
		p2.adresse.numRue = 15;
		p2.adresse.libeleRue = "des plantes";
		p2.adresse.codePostal = 31000;
		p2.adresse.ville = "Toulouse";

	}

}
