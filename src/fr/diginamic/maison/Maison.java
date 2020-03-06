/**
 * 
 */
package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pierre
 *
 */
public class Maison {

	private List<Piece> list = new ArrayList<Piece>();

	public void ajouterPiece(Piece p) {

		if (p != null) {
			if (p.getSuperficie() > 0) {
				list.add(p);
			} else {
				throw new ArithmeticException("La superficie de vos pieces ne peut etre négative");
			}
		} else {
			throw new NullPointerException("Votre piece doit avoir une superficie et un etage");
		}

	}

	public double getSuperficieTotale() {

		double superficieTotale = 0;

		for (Piece p : list) {

			superficieTotale += p.getSuperficie();

		}

		return superficieTotale;

	}

	public double getSuperficieParEtage(int etage) {

		double superficieTotale = 0;

		for (Piece p : list) {

			if (p.getEtage() == etage) {

				superficieTotale += p.getSuperficie();

			}

		}

		return superficieTotale;

	}

	public double getSuperficieParTypePiece(String piece) {

		double superficieTotale = 0;

		for (Piece p : list) {

			if (p.getClass().getSimpleName().toUpperCase().equals(piece.toUpperCase().replace(" ", ""))) {

				superficieTotale += p.getSuperficie();

			}

		}

		return superficieTotale;

	}
	
	public int getNbPiecesParTypePiece(String piece) {
		
		int nbPiece = 0;
		
		for (Piece p : list) {
			
			if (p.getClass().getSimpleName().toUpperCase().equals(piece.toUpperCase().replace(" ", ""))) {
				
				nbPiece += 1;
				
			}
			
		}
		
		return nbPiece;
		
	}

}
