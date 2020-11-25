package com.coaching.volaille.volailleARendre;

public class Paon extends VolailleARendre {

	public static final int nombrePaonMax = 3;
	private static int nombrePaon;

	public Paon(int poids) {
		super(poids);
	}

	public int getNombre() {
		return nombrePaon;
	}

	public void setNombre(int nombrePaon) {
		Paon.nombrePaon = nombrePaon;
	}

	@Override
	public String affiche() {
		return "paon";
	}

	@Override
	public String toString() {
		return "Paon id =  "+this.getId() +" dateAccueil=" + dateAccueil + ", poids=" + poids;
	}
	
	
}
