package com.coaching.volaille.volailler;

import java.util.ArrayList;

import com.coaching.volaille.Volaille;
import com.coaching.volaille.volailleARendre.Cygne;
import com.coaching.volaille.volailleARendre.Paon;
import com.coaching.volaille.volailleAVendre.Canard;
import com.coaching.volaille.volailleAVendre.Poulet;

public class Poulailler extends ArrayList<Volaille> {

	public void ajouter(Volaille volaille, int nombre) {
		if (Volaille.getNombreAnimal() < Volaille.NOMBRE_ANIMAL_MAX) {
			if (volaille.getNombre() < nombre) {
				this.add(volaille);
				volaille.setId();
				volaille.setNombre(volaille.getNombre() + 1);
				Volaille.setNombreAnimal(Volaille.getNombreAnimal() + 1);
				System.out.println("un " + volaille.affiche() + " a �te ajout�");
			} else {
				System.out.println("le nombre limite " + volaille.affiche() + "  atteint");
			}

		} else {
			System.out.println("le nombre limite atteint");
		}
	}

	public void retirer(Volaille volaille) {
		if (this.contains(volaille)) {
			this.remove(volaille);
			volaille.setNombre(volaille.getNombre() - 1);
			Volaille.setNombreAnimal(Volaille.getNombreAnimal() - 1);
			System.out.println("un " + volaille.affiche() + " a �te supprim�");
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

		System.out.println("le nombre de poulet est egale � : " + i 
				+ "\n le nombre de canard est egale � : " + j
				+ "\n le nombre de paon est egale � : " + k
				+ "\n le nombre de cygne est egale � : " + l);
	}

	public void prixTotalVolailleAbatable() {
		int prix = 0;
		for (Volaille volaille : this) {
			if (volaille instanceof Poulet) {
				int poids = ((Poulet) volaille).getPoids();
				if (poids >= Poulet.getPoidAbatage()) {
					prix += Poulet.getPrixKilo() * (poids / 1000);
				}
			} else if (volaille instanceof Canard) {
				int poids = ((Canard) volaille).getPoids();
				if (poids >= Canard.getPoidAbatage()) {
					prix += Canard.getPrixKilo() * (poids / 1000);
				}
			}
		}

		System.out.println("Le prix total de volaille abattable est : " + prix +" �");
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
