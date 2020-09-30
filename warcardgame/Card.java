package warcardgame;

public class Card {
    private int value;
    private int color;
    private boolean rarity;

    public Card(int value, int color, boolean rarity) {
        this.value= value;
        this.color= color;
        this.rarity = rarity;
    }


    public int getValue() {
        return value;
    }

    public int getColor() {
        return color;
    }

    public boolean isRare() {
        return rarity;
    }
}
