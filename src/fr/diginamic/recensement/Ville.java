/**
 * 
 */
package fr.diginamic.recensement;

import java.util.List;

/**
 *
 * @author Pierre
 *
 */
public class Ville implements Comparable<Ville> {

	/** codeRegion */
	private int codeRegion;

	/** nomRegion */
	private String nomRegion;

	/** codeDep */
	private String codeDep;

	/** codeComm */
	private int codeComm;

	/** nomComm */
	private String nomComm;

	/** popTotale */
	private Integer popTotale;

	/**
	 * Constructor
	 *
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDep
	 * @param codeComm
	 * @param nomComm
	 * @param popTotale
	 */
	public Ville(int codeRegion, String nomRegion, String codeDep, int codeComm, String nomComm, int popTotale) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDep = codeDep;
		this.codeComm = codeComm;
		this.nomComm = nomComm;
		this.popTotale = popTotale;
	}

	/**
	 * Getter
	 *
	 * @return the codeRegion
	 */
	public int getCodeRegion() {
		return codeRegion;
	}

	/**
	 * Setter
	 *
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	/**
	 * Getter
	 *
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * Setter
	 *
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/**
	 * Getter
	 *
	 * @return the codeDep
	 */
	public String getCodeDep() {
		return codeDep;
	}

	/**
	 * Setter
	 *
	 * @param codeDep the codeDep to set
	 */
	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}

	/**
	 * Getter
	 *
	 * @return the codeComm
	 */
	public int getCodeComm() {
		return codeComm;
	}

	/**
	 * Setter
	 *
	 * @param codeComm the codeComm to set
	 */
	public void setCodeComm(int codeComm) {
		this.codeComm = codeComm;
	}

	/**
	 * Getter
	 *
	 * @return the nomComm
	 */
	public String getNomComm() {
		return nomComm;
	}

	/**
	 * Setter
	 *
	 * @param nomComm the nomComm to set
	 */
	public void setNomComm(String nomComm) {
		this.nomComm = nomComm;
	}

	/**
	 * Getter
	 *
	 * @return the popTotale
	 */
	public int getPopTotale() {
		return popTotale;
	}

	/**
	 * Setter
	 *
	 * @param popTotale the popTotale to set
	 */
	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}

	@Override
	public String toString() {
		return "Code de la région " + codeRegion + "\nNom de la région " + nomRegion + "\nCode du département "
				+ codeDep + "\nCode de la commune " + codeComm + "\nNom de la commune " + nomComm
				+ "\nPopulation totale " + popTotale;
	}

	@Override
	public int compareTo(Ville v) {
		return popTotale.compareTo(v.popTotale);
	}

	public static void printListFromStart(List<Ville> list, int indice) {

		for (int i = 0; i < indice; i++) {

			System.out.println(list.get(i) + "\n");

		}

	}

	public static void printListFromEnd(List<Ville> list, int indice) {

		for (int i = list.size() - 1; i >= list.size() - indice; i--) {

			System.out.println(list.get(i) + "\n");

		}

	}

}
