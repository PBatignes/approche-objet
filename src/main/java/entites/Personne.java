package entites;

/**Représentation d'une personne
 * 
 * @author Pierre
 *
 */
public class Personne {
	
	/** Nom de la personne */
	public String nom;
	
	/** Prénom de la personne */
	public String prenom;
	
	/** Adresse de la personne */
	public AdressePostale adresse;
	
	/**Constructor
	 *
	 * @param nom		Nom de la personne
	 * @param prenom	Prénom de la personne
	 */
	public Personne (String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
		
	}
	
	/**Constructor
	 *
	 * @param nom		Nom de la personne
	 * @param prenom	Prénom de la personne
	 * @param adresse	Adresse de la personne
	 */
	public Personne (String nom, String prenom, AdressePostale adresse) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		
	}
	
	/**Affiche le nom en majusqule et le prénom d'une personne
	 * 
	 * @param p		Une personne
	 */
	public void printNameSurname (Personne p) {
		
		System.out.println(p.nom.toUpperCase() + " " + p.prenom);
		
	}
	
	/**Getter
	 * 
	 * @return nom
	 */
	public String getName () {
		
		return this.nom;
		
	}
	
	/**Setter
	 * 
	 * @param nom
	 */
	public void setName (String nom) {
		
		this.nom = nom;
		
	}
	
	/**Getter
	 * 
	 * @return prenom
	 */
	public String getSurname () {
		
		return this.prenom;
		
	}
	
	/**Setter
	 * 
	 * @param prenom
	 */
	public void setSurname (String prenom) {
		
		this.prenom = prenom;
		
	}
	
	/**Getter
	 * 
	 * @return adresse
	 */
	public AdressePostale getAdresse () {
		
		return this.adresse;
		
	}
	
	/**Setter
	 * 
	 * @param adresse
	 */
	public void setAdresse (AdressePostale adresse) {
		
		this.adresse = adresse;
		
	}

}
