package com.coaching.volaille.volailler;

import java.util.ArrayList;

import com.coaching.volaille.Volaille;
import com.coaching.volaille.volailleARendre.Cygne;
import com.coaching.volaille.volailleARendre.Paon;
import com.coaching.volaille.volailleAVendre.Canard;
import com.coaching.volaille.volailleAVendre.Poulet;

public class Poulailler extends ArrayList<Volaille> {

	public void ajouter(Volaille volaille, int nombre) {
		if (Volaille.getNombreAnimal() < Volaille.nombreAnimalMax) {
			if (volaille.getNombre() < nombre) {
				this.add(volaille);
				volaille.setNombre(volaille.getNombre() + 1);
				Volaille.setNombreAnimal(Volaille.getNombreAnimal() + 1);
				System.out.println("un " + volaille.affiche() + " a éte ajouter");
			} else {
				System.out.println("le nombre limite " + volaille.affiche() + "  atteint");
			}

		} else {
			System.out.println("le nombre limite  atteint");
		}
	}

	public void retirer(Volaille volaille) {
		if (this.contains(volaille)) {
			this.remove(volaille);
			volaille.setNombre(volaille.getNombre() - 1);
			Volaille.setNombreAnimal(Volaille.getNombreAnimal() - 1);
			System.out.println("un " + volaille.affiche() + " a éte supprimer");
		} else {
			System.out.println("cette " + volaille.affiche() + " n'est pas dans le poulailler");
		}
	}

	public void nombreVolailleType() {
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		for (Volaille volaille : this) {
			if (volaille instanceof Poulet) {
				i++;
			} else if (volaille instanceof Canard) {
				j++;
			}else if (volaille instanceof Paon) {
				k++;
			}else if (volaille instanceof Cygne) {
				l++;
			}
		}

		System.out.println("le nombre de poulet est egale à : " + i 
				+ "\n le nombre de canard est egale à : " + j
				+ "\n le nombre de paon est egale à : " + k
				+ "\n le nombre de cygne est egale à : " + l);
	}

	public void prixTotalVolailleAbatable() {
		int prix = 0;
		for (Volaille volaille : this) {
			if (volaille instanceof Poulet) {
				int poid = ((Poulet) volaille).getPoids();
				if (poid >= Poulet.getPoidAbatage()) {
					prix += Poulet.getPrixKilo() * (poid / 1000);
				}
			} else if (volaille instanceof Canard) {
				int poid = ((Canard) volaille).getPoids();
				if (poid >= Canard.getPoidAbatage()) {
					prix += Canard.getPrixKilo() * (poid / 1000);
				}
			}
		}

		System.out.println("Le prix total de volaille abatable est : " + prix);
	}
	
	
	@Override
	public String toString() {
		String affichage="";
		for (Volaille volaille : this) {
			affichage += "\n"+volaille.toString();
					}
		return affichage;
	}

}
