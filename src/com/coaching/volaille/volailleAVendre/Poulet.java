package com.coaching.volaille.volailleAVendre;

public final class Poulet extends VolailleAVendre {

	public static final int nombrePouletMax = 5;
	private static int nombrePoulet;
	private static int poidAbatage=800;
	static int prixKilo;

	public Poulet(int poids) {
		super(poids);
	}
	
	public static int getPoidAbatage() {
		return poidAbatage;
	}


	public static void setPoidAbatage(int poidAbatage) {
		Poulet.poidAbatage = poidAbatage;
	}


	public static int getPrixKilo() {
		return prixKilo;
	}


	public static void setPrixKilo(int prixKilo) {
		Poulet.prixKilo = prixKilo;
	}


	public int getNombre() {
		return nombrePoulet;
	}

	public void setNombre(int nombreCanard) {
		this.nombrePoulet = nombreCanard;
	}


	@Override
	public String affiche() {
		return "poulet";
		
	}
	
	

	
}
