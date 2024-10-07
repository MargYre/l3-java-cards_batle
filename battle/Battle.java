package battle;

public class Battle {
    public static void main(String[] args) {
        
        Player player1 = new Player("Joueur 1");
        Player player2 = new Player("Joueur 2");
        Card card1 = new Card("Cœur", 10);
        Card card2 = new Card("Pique", 5);

        player1.ajouterCarte(card1);
        player2.ajouterCarte(card2);
        System.out.println(player1);
        System.out.println(player2);

        //comparaison cartes
        int result = card1.compare(card2);
        System.out.println("Résultat de la comparaison : " + result);
    }
}
