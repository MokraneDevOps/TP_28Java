package chifoumi;

import java.util.Scanner;

public class Jouer_Chifoumi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        Chifoumi jeu = new Chifoumi();

		        int choix;
		        do {
		            System.out.println("Combien de parties voulez-vous jouer?");
		            int nombreParties = scanner.nextInt();

		            int pointsJoueur = 0;
		            int pointsMachine = 0;

		            for (int i = 0; i < nombreParties; i++) {
		                jeu.getChoixJoueur();
		                jeu.getChoixMachine();
		                jeu.afficheChoix();
		                int resultat = jeu.resultatJeu();

		                if (resultat == 1) {
		                    pointsMachine++;
		                } else if (resultat == 2) {
		                    pointsJoueur++;
		                }
		            }

		            System.out.println("Score final - Joueur: " + pointsJoueur + " | Machine: " + pointsMachine);

		            System.out.println("Voulez-vous continuer? (1 pour oui, 0 pour non)");
		            choix = scanner.nextInt();
		        } while (choix == 1);
		    
		

	}

}
