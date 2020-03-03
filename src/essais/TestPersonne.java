package essais;

import entites.AdressePostale;
import entites.Personne;
import essais.TestAdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale ad1 = new AdressePostale(5, "du chamberlain", 31000, "Toulouse");

		Personne p1 = new Personne("Batignes", "Pierre", ad1);

	}

}
