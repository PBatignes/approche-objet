package tri;

/**
 *
 * @author Pierre
 *
 */
public class Pays implements  Comparable<Pays>{
	
	/** nom */
	private String nom;
	
	/** nbHab */
	private int nbHab;
	
	/** pib */
	private int pib;

	/**Constructor
	 *
	 * @param nom
	 * @param nbHab
	 * @param pib
	 */
	public Pays(String nom, int nbHab, int pib) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.pib = pib;
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
	 * @return the nbHab
	 */
	public Integer getNbHab() {
		return nbHab;
	}

	/**Setter
	 *
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	/**Getter
	 *
	 * @return the pib
	 */
	public Integer getPib() {
		return pib;
	}

	/**Setter
	 *
	 * @param pib the pib to set
	 */
	public void setPib(int pib) {
		this.pib = pib;
	}

	@Override
	public String toString() {
		return nom + ", " + nbHab + ", " + pib;
	}
	
	public long getPibTotal () {
		
		return (long)nbHab * (long)pib;
		
	}

	@Override
	public int compareTo(Pays p) {
		return nom.compareTo(p.getNom());
	}
	
}
