/**
 * 
 */
package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

/**
 *
 * @author Pierre
 *
 */
public class Application {
	
	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}

	public static void main(String[] args) {

		List<Ville> villes = new ArrayList<>();
		List<Ville> villesHerault = new ArrayList<>();
		List<Ville> villesOccitanie = new ArrayList<>();
		int popHerault = 0;
		int popOccitanie = 0;
		Ville pettiteHerault = null;

		try {
			File file = new File("C:/dev/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			lignes.remove(0);

			for (String s : lignes) {

				String[] morceaux = s.split(";");
				String codeReg = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDep = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				String population = morceaux[7];
				int codeRegion = Integer.parseInt(codeReg.replace(" ", "").trim());

				int codeComm = Integer.parseInt(codeCommune.replace(" ", "").trim());

				int popTotale = Integer.parseInt(population.replace(" ", "").trim());

				villes.add(new Ville(codeRegion, nomRegion, codeDep, codeComm, nomCommune, popTotale));

			}

			// Recherche dans la liste la ville de Montpellier et affichez toutes les
			// informations la concernant
			for (Ville v : villes) {

				if (v.getNomComm().equals("Montpellier")) {

					System.out.println(v);

				}

			}

			// Calcule et affiche la population totale de l'Hérault
			//Affiche la plus petite ville du département
			for (Ville v : villes) {

				if (v.getCodeDep().equals("34")) {

					popHerault += v.getPopTotale();
					if (pettiteHerault == null || pettiteHerault.getPopTotale() > v.getPopTotale()) {
						
						pettiteHerault = v;
						
					}

				}

			}
			System.out.println("\nPopulation totale de l'hérault : " + popHerault);
			System.out.println("\nPlus petite ville du département de l'Hérault : \n" + pettiteHerault);
			
			//Affiche les 10 plus grandes villes de l'Hérault
			//Affiche les 10 plus petites villes de l'Hérault
			for (Ville v : villes) {
				
				if (v.getCodeDep().equals("34")) {
					
					villesHerault.add(v);
					
				}
				
			}
			Collections.<Ville>sort(villesHerault);
			System.out.println("\nLes 10 plus grande ville de l'Hérault sont : ");
			Ville.printListFromEnd(villesHerault, 10);
			
			System.out.println("\nLes 10 plus petite ville de l'Hérault sont : ");
			Ville.printListFromStart(villesHerault, 10);
			
			//Affiche la population totale de la région Occitanie
			for (Ville v : villes) {
				
				if (v.getNomRegion().equals("Occitanie")) {
					
					popOccitanie += v.getPopTotale();
					
				}
				
			}
			System.out.println("La population totale de larégion Occitanie est de : " + popOccitanie);
			
			//Affiche les 10 villes les plus importantes de la région Occitanie
			for (Ville v : villes) {
				
				if (v.getNomRegion().equals("Occitanie")) {
					
					villesOccitanie.add(v);
					
				}
				
			}
			Collections.<Ville>sort(villesOccitanie);
			System.out.println("\nLes 10 plus grande ville de la région Occitanie sont : ");
			Ville.printListFromEnd(villesOccitanie, 10);
			
			//Affiche le département le plus peuplés de la région Occitanie
			HashMap<String, Integer> depOccitanie = new HashMap<>();
			for (Ville v : villes) {
				
				if (v.getNomRegion().equals("Occitanie")) {
					
					String codeDep = v.getCodeDep();
					int pop = v.getPopTotale();
					
					if (depOccitanie.get(codeDep) == null) {
						
						depOccitanie.put(codeDep, pop);
						
					} else {
						
						depOccitanie.put(codeDep, depOccitanie.get(codeDep) + pop);
						
					}
					
				}
				
			}
			List<Integer> list = new ArrayList<>(depOccitanie.values());
			Collections.sort(list);
			String a = getKey(depOccitanie, list.get(list.size() - 1));
			System.out.println("Le département le plus peuplé de la région Occitanie est le : " 
					+ a + " avec une population de " + list.get(list.size() - 1));
			
			//Affiche les 10 régions les plus peuplés de France
			HashMap<String, Integer> regFrance = new HashMap<>();
			for (Ville v : villes) {
					
					String region = v.getNomRegion();
					int pop = v.getPopTotale();
					
					if (regFrance.get(region) == null) {
						
						regFrance.put(region, pop);
						
					} else {
						
						regFrance.put(region, regFrance.get(region) + pop);
						
					}
				
			}
			List<Integer> listRegion = new ArrayList<>(regFrance.values());
			Collections.sort(listRegion);
			System.out.println("\nLes 10 régions les plus peuplés de France sont : ");
			for (int i = listRegion.size() - 1; i >= listRegion.size() - 10; i--) {
				
				System.out.println(getKey(regFrance, listRegion.get(i)));
				
			}
			
			//Affiche les 10 départements les plus peuplés de France
			HashMap<String, Integer> depFrance = new HashMap<>();
			for (Ville v : villes) {
					
					String dep = v.getCodeDep();
					int pop = v.getPopTotale();
					
					if (depFrance.get(dep) == null) {
						
						depFrance.put(dep, pop);
						
					} else {
						
						depFrance.put(dep, depFrance.get(dep) + pop);
						
					}
				
			}
			List<Integer> listDep = new ArrayList<>(depFrance.values());
			Collections.sort(listDep);
			System.out.println("\nLes 10 départements les plus peuplés de France sont : ");
			for (int i = listDep.size() - 1; i >= listDep.size() - 10; i--) {
				
				System.out.println(getKey(depFrance, listDep.get(i)));
				
			}
			
			//Affiche les 10 villes les plus peuplés de France
			Collections.<Ville>sort(villes);
			System.out.println("\nLes 10 villes les plus peuplé de France sont : ");
			Ville.printListFromEnd(villes, 10);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
