package com.coaching.volaille.volailleARendre;

public class Paon extends VolailleARendre{
	
	public static final int nombrePaonMax=3;
	private static int nombrePaon;

	public Paon() {
    super();
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
}
