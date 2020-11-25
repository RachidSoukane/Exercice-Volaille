package com.coaching.volaille.volailleAVendre;

public final class Canard extends VolailleAVendre {

	public static final int nombreCanardMax = 4;
	private static int nombreCanard;
	private static int poidAbatage=2200;
	private static int prixKilo;
	

	public  Canard(int poids) {
		super(poids);
	}
	
	public static int getPoidAbatage() {
		return poidAbatage;
	}


	public static void setPoidAbatage(int poidAbatage) {
		Canard.poidAbatage = poidAbatage;
	}


	public static int getPrixKilo() {
		return prixKilo;
	}


	public static void setPrixKilo(int prixKilo) {
		Canard.prixKilo = prixKilo;
	}

	public int getNombre() {
		return nombreCanard;
	}

	public void setNombre(int nombreCanard) {
		this.nombreCanard = nombreCanard;
	}

	@Override
	public String affiche() {
		return"canard";
		
	}

	@Override
	public String toString() {
		return "Canard  id = " +this.getId() +" poids=" + poids;
	}
	
	

	

	
}
