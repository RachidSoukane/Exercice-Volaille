package com.coaching.volaille.programme;

import java.util.Collections;
import java.util.Scanner;

import com.coaching.volaille.Volaille;
import com.coaching.volaille.volailleARendre.Cygne;
import com.coaching.volaille.volailleARendre.Paon;
import com.coaching.volaille.volailleAVendre.Canard;
import com.coaching.volaille.volailleAVendre.Poulet;
import com.coaching.volaille.volailler.Poulailler;

public class MenuAction {

	Poulailler poulailler = new Poulailler();

	public static float scannerFloat(Scanner in, String message) {
		System.out.println(message);
		float i = in.nextFloat();
		if (in.hasNextLine()) {
			in.nextLine();
		}
		return i;
	}

	public static int scannerInt(Scanner in, String message) {
		System.out.println(message);
		int i = in.nextInt();
		if (in.hasNextLine()) {
			in.nextLine();
		}
		return i;
	}

	public static String scannerString(Scanner in, String message) {
		if (message != null)
			System.out.println(message);
		String i = in.nextLine();
		return i;
	}

	public void menuGeneral() {
		boolean sortie = true;
		try (Scanner in = new Scanner(System.in)) {
			while (sortie) {
				MenuAffichage.menuGeneral();
				switch (scannerInt(in, "\n\nfaites votre Choix SVP")) {
				case 0:
					sortie = false;
					break;
				case 1:

					menuEnregistrement(in);
					break;
				case 2:

					menuSortie(in);
					break;
				case 3:

					menuModification(in);
					break;
				case 4:

					menuAffichage(in);
					break;
				default:
					System.out.println("je n'ai pas compris votre choix");
					break;

				}
			}
		}

	}

	public void menuEnregistrement(Scanner in) {
		boolean sortie = true;
		while (sortie) {
			MenuAffichage.menuEnregistrement();
			switch (scannerInt(in, "\n\nfaites votre Choix SVP")) {
			case 0:
				sortie = false;
				break;
			case 1:
				this.poulailler.ajouter(new Poulet(scannerInt(in, "Veuillez entrer le poids initiale du poulet")),
						Poulet.nombrePouletMax);
				break;
			case 2:
				this.poulailler.ajouter(new Canard(scannerInt(in, "Veuillez entrer le poids initiale du Canard")),
						Canard.nombreCanardMax);
				break;
			case 3:
				this.poulailler.ajouter(new Paon(scannerInt(in, "Veuillez entrer le poids initiale du paon")),
						Paon.nombrePaonMax);
				break;
			case 4:
				this.poulailler.ajouter(new Cygne(scannerInt(in, "Veuillez entrer le poids initiale du Cygne")),
						Cygne.nombreCygneMax);
				break;
			default:
				System.out.println("je n'ai pas compris votre choix");
				break;

			}

		}
	}

	public void menuSortie(Scanner in) {
		boolean sortie = true;
		while (sortie) {
			MenuAffichage.menuSortie();
			switch (scannerInt(in, "Faites votre Choix SVP")) {
			case 0:
				sortie = false;
				break;
			case 1:
				if(affichageListe(0)==0) {
					System.out.println("Il ne reste plus de poulet");
					break;
				}
				Volaille pvolaille = Volaille.getVolailleById(poulailler,
						scannerInt(in, "Veuillez saisire l'Id du poulet"));
				if (pvolaille instanceof Poulet && pvolaille != null) {
					this.poulailler.retirer(pvolaille);
				} else {
					System.out.println("la volaille que vous venez de selectionné n'est pas un poulet");
				}
				break;
			case 2:
				if(affichageListe(1)==0) {
					System.out.println("Il ne reste plus de canard");
					break;
				}
				Volaille pvolaille2 = Volaille.getVolailleById(poulailler,
						scannerInt(in, "Veuillez saisire l'Id du canard"));
				if (pvolaille2 instanceof Canard && pvolaille2 != null) {
					this.poulailler.retirer(pvolaille2);
				} else {
					System.out.println("la volaille que vous venez de selectionné n'est pas un canard");
				}

				break;
			case 3:
				if(affichageListe(2)==0) {
					System.out.println("Il ne reste plus de paon");
					break;
				}
				Volaille pvolaille3 = Volaille.getVolailleById(poulailler,
						scannerInt(in, "Veuillez saisire l'Id du paon"));
				if (pvolaille3 instanceof Paon && pvolaille3 != null) {
					this.poulailler.retirer(pvolaille3);
				} else {
					System.out.println("la volaille que vous venez de selectionné n'est pas un paon");
				}
				break;
			case 4:
				if(affichageListe(3)==0) {
					System.out.println("Il ne reste plus de cygne");
					break;
				}
				Volaille pvolaille4 = Volaille.getVolailleById(poulailler,
						scannerInt(in, "Veuillez saisire l'Id du cygne"));
				if (pvolaille4 instanceof Cygne && pvolaille4 != null) {
					this.poulailler.retirer(pvolaille4);
				} else {
					System.out.println("la volaille que vous venez de selectionné n'est pas un cygne");
				}
				break;
			default:
				System.out.println("je n'ai pas compris votre choix");
				break;

			}

		}

	}

	public void menuModification(Scanner in) {
		boolean sortie = true;
		while (sortie) {
			MenuAffichage.menuModification();
			switch (scannerInt(in, "\n\nfaites votre Choix SVP")) {
			case 0:
				sortie = false;
				break;
			case 1:
				Poulet.setPoidAbatage(scannerInt(in, "Veuillez donner les nouveau poids d'abattage du poulet"));
				break;
			case 2:
				Canard.setPoidAbatage(scannerInt(in, "Veuillez donner les nouveau poids d'abattage du canard"));
				break;
			case 3:
				Poulet.setPrixKilo(scannerInt(in, "Veuillez donner les nouveau prix du jour du poulet"));
				break;
			case 4:
				Canard.setPrixKilo(scannerInt(in, "Veuillez donner les nouveau prix du jour du canard"));
				break;
			case 5:
				Volaille volaille = Volaille.getVolailleById(poulailler,
						scannerInt(in, "Veuillez saisire l'Id du volaille"));
				volaille.setPoids(scannerInt(in, "Veuillez donner le nouveau poids de ce volaille"));
				break;
			default:
				System.out.println("je n'ai pas compris votre choix");
				break;

			}

		}
		sortie = true;
	}

	public void menuAffichage(Scanner in) {
		boolean sortie = true;
		while (sortie) {
			MenuAffichage.menuAffichage();
			switch (scannerInt(in, "Faites votre Choix SVP")) {
			case 0:
				sortie = false;
				break;
			case 1:
				this.poulailler.prixTotalVolailleAbatable();
				break;
			case 2:
				this.poulailler.nombreVolailleType();
				break;
			case 3:
				System.out.println(this.poulailler);
				break;
			case 4:
				Collections.sort(this.poulailler);
				System.out.println(this.poulailler);
				break;
			default:
				System.out.println("je n'ai pas compris votre choix");
				break;

			}

		}
		sortie = true;
	}
	
	public int affichageListe (int a) {
		int i=0;
		if(a == 0) {
			for (Volaille volaille : poulailler) {
				if (volaille instanceof Poulet) {
					System.out.println(volaille.toString());
					i++;
				} 
			}
		}else if(a == 1) {
			for (Volaille volaille : poulailler) {
				if (volaille instanceof Canard) {
					System.out.println(volaille.toString());
					i++;
				} 
			}
		}else if(a == 2 ) {
			for (Volaille volaille : poulailler) {
				if (volaille instanceof Paon) {
					System.out.println(volaille.toString());
					i++;
				} 
			}
		}else if(a == 3) {
			for (Volaille volaille : poulailler) {
				if (volaille instanceof Cygne) {
					System.out.println(volaille.toString());
					i++;
				} 
			}
		}
	 return i;
		
	}

}
