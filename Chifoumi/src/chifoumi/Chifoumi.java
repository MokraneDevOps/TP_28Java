package chifoumi;

	import java.util.Scanner;
	
	public class Chifoumi {
	    int choixMachine;
	    int choixJoueur;
	    Scanner clavier;

	    public Chifoumi() {
	        clavier = new Scanner(System.in);
	    }

	    public String conversion(int choix) {
	        switch (choix) {
	            case 0:
	                return "Caillou";
	            case 1:
	                return "Papier";
	            case 2:
	                return "Ciseaux";
	            default:
	                return "Choix invalide";
	        }
	    }

	    public void afficheChoix() {
	        System.out.println("La machine a choisi " + conversion(choixMachine));
	        System.out.println("Vous avez choisi " + conversion(choixJoueur));
	    }

	    public int resultatJeu() {
	        int resultat = (choixJoueur - choixMachine + 3) % 3;
	        switch (resultat) {
	            case 0:
	                System.out.println("Égalité");
	                break;
	            case 1:
	                System.out.println("La machine gagne!");
	                break;
	            case 2:
	                System.out.println("Vous avez gagné!");
	                break;
	        }
			return resultat;
	    }

	    public void getChoixMachine() {
	        choixMachine = (int) (Math.random() * 3);
	    }

	    public void getChoixJoueur() {
	        System.out.println("Entrez votre choix :\n0 pour Caillou, 1 pour Papier, 2 pour Ciseaux");
	        choixJoueur = clavier.nextInt();
	    }
	}
