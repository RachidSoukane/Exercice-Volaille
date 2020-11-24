package com.coaching.volaille.programme;

public class MenuAffichage {
	
	public void menuGeneral() {
		System.out.println("0) Sortir "
				+ "/n1) Enregistrement d'une volaille"				
				+ "/n2) Sortie d'une volaille"
				+ "/n3) Gestion du poids/prix d'une volaille"
				+ "/n4) Affichage détaillé ");
	}
	
	public void menuEnregistrement() {
		System.out.println("0) revenir au menu précedent "
				+ "/n1) Enregistrement d'un poulet"
				+ "/n2) Enregistrement d'un canard"
				+ "/n3) Enregistrement d'un paon"
				+ "/n4) Enregistrement d'un cygne");
	}
	
	public void menuSortie() {
		System.out.println("0) revenir au menu précedent "
				+ "/n1) Vente d'un poulet"
				+ "/n2) Vente d'un canard"
				+ "/n3) Rendre un paon"
				+ "/n4) Rendre un cygne");
	}
	
	public void menuModification() {
		System.out.println("0) revenir au menu précedent "
				+ "/n1) Modification du poids d'abattage d'un poulet"
				+ "/n2) Modification du poids d'abattage d'un canard"
				+ "/n3) modification du prix du jour du poulet"
				+ "/n4) Modification du prix du jour du canard"
				+ "/n5) Modification du poids d'une volaille");
	}
	
	public void menuAffichage() {
		System.out.println("0) revenir au menu précedent "
				+ "/n1) Affichage du total de prix des volailles abatables"				
				+ "/n2) Affichage du nombre de volailles par type"
				+ "/n3) voir toutes les volailles"
				+ "/n4) listing de volailles par ordre ");		
	}
	
	
	

}
