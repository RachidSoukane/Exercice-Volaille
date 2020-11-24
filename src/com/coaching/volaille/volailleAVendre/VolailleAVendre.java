package com.coaching.volaille.volailleAVendre;

import com.coaching.volaille.Volaille;

public abstract class VolailleAVendre extends Volaille {

	protected static int prixPoidsKilo;

	public VolailleAVendre(int poids) {
		super(poids);
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public static int getPrixPoidsKilo() {
		return prixPoidsKilo;
	}

	public static void setPrixPoidsKilo(int prixPoidsKilo) {
		VolailleAVendre.prixPoidsKilo = prixPoidsKilo;
	}

}
