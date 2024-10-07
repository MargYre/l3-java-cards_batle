package battle;
import java.util.ArrayList;
import java.util.List;

public class Player {
    // attributs : nom, paquet (tableau ou liste de Carte) et score (compteur de points)
    private String nom;
    private List<Card> paquet;
    private int score;

    // constructeur
    public Player(String nom) {
        this.nom = nom;
        this.paquet = new ArrayList<>();
        this.score = 0;
    }
    // methodes : accesseurs
    public String getNom() {
        return nom;
    }
    public List<Card> getPaquet() {
        return paquet;
    }
    public int getScore() {
        return score;
    }
    // modificateurs,
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPaquet(List<Card> paquet) {
        this.paquet = paquet;
    }
    public void setScore(int score) {
        this.score = score;
    }
    //tirer une carte,
    public Card tirerCarte() {
        if (!paquet.isEmpty()) {
            return paquet.remove(0);
        }
        return null;
    }
    //ajouter une carte,
    public void ajouterCarte(Card card) {
        paquet.add(card);
    }
    //toString()
    public String toString() {
            return "Joueur : " + nom + " | Score : " + score + " | Nombre de cartes : " + paquet.size();
    }
}