package fr.diginamic.salaire;

/**
 * 
 * @author Pierre
 *
 */
public abstract class Intervenant {
	
	/** nom */
	private String nom;
	
	/** prenom */
	private String prenom;

	/**Constructor
	 *
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
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
	
	public abstract double getSalaire();
	
	public void afficherDonnees() {
		
		System.out.println("Nom : " + this.nom + "\nPrénom : " + this.prenom);
		
	}

}
