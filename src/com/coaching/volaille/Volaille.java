package com.coaching.volaille;

import java.util.ArrayList;

import com.coaching.volaille.volailleARendre.VolailleARendre;
import com.coaching.volaille.volailleAVendre.VolailleAVendre;
import com.coaching.volaille.volailler.Poulailler;



public abstract class Volaille implements Comparable<Volaille> {
	public static final int nombreAnimalMax = 8;
	private static int nombreAnimal;
	private int id;
	private static int compteur;
	protected int poids;

	public Volaille(int poids) {
		this.poids = poids;
		this.id = ++compteur;
	}

	public int getId() {
		return this.id;
	}

	public static int getNombreAnimal() {
		return nombreAnimal;
	}

	public static void setNombreAnimal(int nombreAnimal) {
		Volaille.nombreAnimal = nombreAnimal;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	@Override
	public int compareTo(Volaille volaille) {
		if (volaille instanceof VolailleARendre && this instanceof VolailleARendre) {
			return ((VolailleARendre) this).getDateAccueil().compareTo(((VolailleARendre) volaille).getDateAccueil());
		} else if (this instanceof VolailleARendre && volaille instanceof VolailleAVendre) {
			return -1;
		}else if(volaille instanceof VolailleARendre && this instanceof VolailleAVendre) {
			return 1;
		} else  {
			return Integer.compare( volaille.getPoids(),  this.getPoids());
		}

	}
	
	public static Volaille getVolailleById(Poulailler poulailler, int id) {
		for (Volaille volaille : poulailler) {
			if(volaille.getId()==id){
				 return volaille;
			}						
		}
		System.out.println("ce volaille n'existe pas!!!");
		return null;
	}

	public abstract int getNombre();

	public abstract void setNombre(int a);

	public abstract String affiche();

}
