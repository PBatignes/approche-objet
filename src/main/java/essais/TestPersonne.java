package essais;

import entites.AdressePostale;
import entites.Personne;

/**Classe de test des personnes
 * 
 * @author Pierre
 *
 */
public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale ad1 = new AdressePostale(5, "du chamberlain", 31000, "Toulouse");

		Personne p1 = new Personne("Batignes", "Pierre");
		
		p1.setAdresse(ad1);
		
		p1.printNameSurname(p1);

	}

}
