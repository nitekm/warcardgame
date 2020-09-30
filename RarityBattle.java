package warcardgame;

public class RarityBattle implements Battle {
    public static int battle(Card card1, Card card2) {
        if(card1.isRare() && card2.isRare()) return 0;
        if(card1.isRare() && card2.isRare() == false) return 1;
        if(card1.isRare() == false && card2.isRare()) return -1;
        else return 0;
    }
}
