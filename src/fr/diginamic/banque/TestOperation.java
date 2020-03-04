package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

/**Classe de test
 * 
 * @author Pierre
 *
 */
public class TestOperation {

	public static void main(String[] args) {
		
		int montantCredit = 0;
		int montantDebit = 0;
		
		Operation[] tab = new Operation[8];
		
		tab[0] = new Credit("10/5/20", 100);
		tab[1] = new Credit("1/12/19", 50);
		tab[2] = new Credit("20/11/19", 10);
		tab[3] = new Credit("15/10/19", 1000);
		
		tab[4] = new Debit("25/9/19", 250);
		tab[5] = new Debit("12/8/19", 40);
		tab[6] = new Debit("6/7/19", 10);
		tab[7] = new Debit("7/6/19", 20);
		
		for (int i = 0; i < tab.length; i++) {
			
			tab[i].afficherType();
			System.out.println(tab[i] + "\n");
			
			if (tab[i].getType().equals("Credit")) {
				
				montantCredit += tab[i].getMontant();
				
			} else {
				
				montantDebit -= tab[i].getMontant();
				
			}
			
		}
		
		System.out.println("Montant global des crédit : +" + montantCredit +
				"\nMontant global des débit : " + montantDebit);

	}

}
