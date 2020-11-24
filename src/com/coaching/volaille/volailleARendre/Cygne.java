package com.coaching.volaille.volailleARendre;

public class Cygne extends VolailleARendre {

	public static final int nombreCygneMax = 2;
	private static int nombreCygne;

	public Cygne(int poids) {
		super(poids);
	}

	@Override
	public int getNombre() {
		return nombreCygne;
	}

	@Override
	public void setNombre(int nombreCygne) {
		Cygne.nombreCygne = nombreCygne;
	}

	@Override
	public String affiche() {
		return "Cygne";
	}
}
