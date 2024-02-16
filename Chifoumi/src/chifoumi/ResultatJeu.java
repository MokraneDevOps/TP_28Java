package chifoumi;

public class ResultatJeu {


		public int resultatJeu() {
		    int choixJoueur = 0;
			int choixMachine = 0;
			int resultat = (choixJoueur - choixMachine + 3) % 3;
		    switch (resultat) {
		        case 0:
		            System.out.println("Égalité");
		            break;
		        case 1:
		            System.out.println("La machine gagne!");
		            return 1;
		        case 2:
		            System.out.println("Vous avez gagné!");
		            return 2;
		    }
		    return 0; // Égalité
		


	}

}
