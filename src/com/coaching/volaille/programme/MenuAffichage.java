package com.coaching.volaille.programme;

public class MenuAffichage {
	
	public static void menuGeneral() {
		System.out.println("0) Sortir  \n"
				+ "1) Enregistrement d'une volaille \n"				
				+ "2) Sortie d'une volaille \n"
				+ "3) Gestion du poids/prix d'une volaille \n"
				+ "4) Affichage détaillé \n");
	}
	
	public static void menuEnregistrement() {
		System.out.println("0) revenir au menu précedent "
				+ "\n 1) Enregistrement d'un poulet "
				+ "\n 2) Enregistrement d'un canard "
				+ "\n 3) Enregistrement d'un paon "
				+ "\n 4) Enregistrement d'un cygne ");
	}
	
	public static void menuSortie() {
		System.out.println("0) revenir au menu précedent "
				+ "\n 1) Vente d'un poulet "
				+ "\n 2) Vente d'un canard "
				+ "\n 3) Rendre un paon "
				+ "\n 4) Rendre un cygne ");
	}
	
	public static void menuModification() {
		System.out.println("0) revenir au menu précedent "
				+ "\n 1) Modification du poids d'abattage d'un poulet"
				+ "\n 2) Modification du poids d'abattage d'un canard"
				+ "\n 3) modification du prix du jour du poulet"
				+ "\n 4) Modification du prix du jour du canard"
				+ "\n 5) Modification du poids d'une volaille");
	}
	
	public static void menuAffichage() {
		System.out.println("0) revenir au menu précedent "
				+ "\n 1) Affichage du total de prix des volailles abatables"				
				+ "\n 2) Affichage du nombre de volailles par type"
				+ "\n 3) voir toutes les volailles"
				+ "\n 4) listing de volailles par ordre ");		
	}
	
	
	

}
