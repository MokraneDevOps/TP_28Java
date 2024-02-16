package chifoumi;

public class JouerChifoumi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int nombreParties = 3; // Modifier selon le nombre de parties souhaité
		        int pointsJoueur = 0;
		        int pointsMachine = 0;

		        Chifoumi jeu = new Chifoumi();

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
		    
		


	}

}
