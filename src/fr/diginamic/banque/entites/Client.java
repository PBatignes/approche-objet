/**
 * 
 */
package fr.diginamic.banque.entites;

/**Représentation d'un client
 * 
 * @author Pierre
 *
 */
public class Client {
	
	/** nom */
	private String nom;
	
	/** prenom */
	private String prenom;

	/**Constructor
	 *
	 * @param nom		Nom du client
	 * @param prenom	Prénom du client
	 */
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**Getter
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**Setter
	 *
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
