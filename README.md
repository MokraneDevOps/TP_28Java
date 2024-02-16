Le jeu de Chifoumi

Le jeu de Chifoumi s'appelle aussi Caillou-Ciseaux-Papier. Il se joue entre deux joueurs, en général avec les mains. Simultanément, les deux joueurs font un signe avec les mains qui représente soit un caillou, soit des ciseaux, soit un papier.

Nommons A et B les deux joueurs.

 Si les deux joueurs ont fait le même signe, on considère que c'est un cas d'égalité, aucun des deux joueurs ne marque un point.

 Si le joueur A joue Caillou et le joueur B Ciseaux, A marque un point car "le caillou émousse les ciseaux", et réciproquement.

 Si le joueur A joue Papier et le joueur B Caillou, A marque un point car "le papier enveloppe le caillou", et réciproquement.

 Si le joueur A joue Ciseaux et le joueur B Papier, A marque un point car "les ciseaux coupent le papier", et réciproquement.

On demande ici de jouer contre l'ordinateur.

A chaque partie :

 L'utilisateur voit un menu lui permettant de choisir son objet, par exemple taper 0 pour Caillou, 1 pour Papier et 2 pour Ciseaux. Il valide par Entrée.

 Le programme tire alors un nombre au hasard parmi les valeurs 0, 1 et 2, 0 correspondant au Caillou, 1 au Papier et 2 au Ciseaux.

 Le programme doit alors comparer les 2 valeurs et afficher le vainqueur.

 Le vainqueur gagne 1 point par partie.

On impose les entiers 0 pour Caillou, 1 pour Papier et 2 pour Ciseaux.

1) Dresser le tableau de vérité du jeu en complétant le tableau suivant.

Joueur Machine Résultat pour le joueur

 0      0        Egalité

 0      1         Perdu

2) On propose ci-dessous le modèle d'une classe Chifoumi en précisant des méthodes et des attributs : class Chifoumi int choixMachine; int choixJoueur ; Scanner clavier;

public String conversion(int choix) public Chifoumi() public void afficheChoix() public void resultatJeu() public void getChoixMachine() public void getChoixJoueur()

La méthode getChoixMachine() calcule après un tirage au sort le choix de la machine et le stocke dans choixMachine.

La méthode résultatJeu() calcule le résultat et affiche si le joueur a gagné ou perdu ou s'il y a égalité.

La méthode conversion() retourne un des 3 String suivants "Caillou", "Ciseaux" ou "Papier" en fonction de l'argument -0 ou 1 ou 2- fourni.

La méthode afficheChoix() affiche les messages "La machine a choisi …." et "Vous avez choisi …" en remplaçant les pointillés par les objets réellement choisis.

Le constructeur Chifoumi() crée l'objet clavier pour effectuer la saisie du choix du joueur.

Tirage d'un nombre au hasard avec Java

On utilisera pour cela la méthode statique random() de la classe Math, l'exécution de Math.random() retourne un double compris dans l'intervalle [0.0 , 1.0[.

Il faut trouver une solution (simple) permettant d'obtenir un entier dans l'intervalle [0 2] à partir d'un double compris entre 0.0 inclus et 1.0 exclu.

Il est conseillé de visualiser l’aide HTML sur la classe Math de la documentation Java.

Coder la classe Chifoumi.

3) Coder une classe JouerChifoumi avec la méthode main utilisée pour créer un objet Chifoumi et exécuter les diverses méthodes de cet objet afin d'effectuer une partie.

4) On donne un nombre de points à atteindre (3 ou 5 par exemple) et le premier joueur qui a atteint ce nombre de points a gagné, chaque partie comptant 1 point.

Modifier la classe JouerChifoumi ne contenant que la méthode main() pour jouer par exemple 3 parties.

Il faut récupérer le résultat de chaque partie, une solution consiste à modifier la méthode void resultatJeu() par

int resultatJeu()

La méthode retournera par exemple : 0 en cas d'égalité, 1 si la machine a gagné et 2 si c'est le joueur.

5) Modifier la classe JouerChifoumi afin de proposer un menu demandant au joueur le nombre de parties qu'il veut faire, s'il veut jouer ou s'il veut arrêter.

9. Les membres (variables ou fonctions

