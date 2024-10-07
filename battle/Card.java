package battle;

public class Card {
    public static String[] COLORS = {"carrau", "pique", "coeur", "trèfle"};
    public static String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};

    private String color;
    private int value;

    // constructeur
    public Card(String c, int v) {
        this.color = c;
        this.value = v;
    }
    // methodes : accesseurs,
    public String getColor() {
        return color;
    }
    public int getValue() {
        return value;
    }
    // modificateurs,
    public void setColor(String color) {
        this.color = color;
    }
    public void setValue(int value) {
        this.value = value;
    }
    //comparateur 
    public int compare(Card c) {
        if (this.value > c.value) {
            return 1;
        } else if (this.value < c.value) {
            return -1; 
        } else {
            return 0;
        }
    }
    //et toString()
    @Override
    public String toString() {
        return this.value + " de " + this.color;
    }
}
