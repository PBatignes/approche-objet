package entites;

public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne (String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
		
	}
	
	public Personne (String nom, String prenom, AdressePostale adresse) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		
	}
	
	public void printNameSurname (Personne p) {
		
		System.out.println(p.nom.toUpperCase() + " " + p.prenom);
		
	}
	
	public String getName () {
		
		return this.nom;
		
	}
	
	public void setName (String nom) {
		
		this.nom = nom;
		
	}
	
	public String getSurname () {
		
		return this.prenom;
		
	}
	
	public void setSurname (String prenom) {
		
		this.prenom = prenom;
		
	}
	
	public AdressePostale getAdresse () {
		
		return this.adresse;
		
	}
	
	public void setAdresse (AdressePostale adresse) {
		
		this.adresse = adresse;
		
	}

}
