package battle;

import java.util.ArrayList;
import java.util.List;

public class Battle {
    public static void main(String[] args) {
        
        Player player1 = new Player("Joueur 1");
        Player player2 = new Player("Joueur 2");
        Card card1 = new Card("Cœur", 10);
        Card card2 = new Card("Pique", 5);
        int score1 = 0;
        int score2 = 0;

        player1.ajouterCarte(card1);
        player2.ajouterCarte(card2);
        
        List<Card> paquet = new ArrayList<>();
        for (String color : Card.COLORS) {
            for (int value = 2; value <= 14; value++) {
                paquet.add(new Card(color, value));
            }
        }
        while (!paquet.isEmpty()) {
            player1.ajouterCarte(paquet.remove(0));
            if (!paquet.isEmpty()) {
                player2.ajouterCarte(paquet.remove(0));
            }
        }
        while (!player1.getPaquet().isEmpty() && !player2.getPaquet().isEmpty()) {
            Card c1 = player1.tirerCarte();
            Card c2 = player2.tirerCarte();

            System.out.println(player1.getNom() + " joue : " + c1);
            System.out.println(player2.getNom() + " joue : " + c2);
            int result = c1.compare(c2);

            if (result > 0) {
                System.out.println(player1.getNom() + " remporte le pli !");
                score1++;
            } else if (result < 0) {
                System.out.println(player2.getNom() + " remporte le pli !");
                score2++;
            } else {
                System.out.println("Égalité sur ce pli !");
            }
            System.out.println("Scores : " + player1.getNom() + " - " + score1 + " | " + player2.getNom() + " - " + score2);
        }
        System.out.println("=== Fin de la partie ===");
        if (score1 > score2) {
            System.out.println(player1.getNom() + " remporte la partie avec " + score1 + " points !");
        } else if (score2 > score1) {
            System.out.println(player2.getNom() + " remporte la partie avec " + score2 + " points !");
        } else {
            System.out.println("Match nul !");
        }
    }
}
