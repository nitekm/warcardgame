package warcardgame;

import java.util.ArrayList;

public class ColorBattle implements Battle{

    public static int battle(ArrayList<Card> cardDeck1, ArrayList<Card> cardDeck2) {
        int deck1wins = 0;
        int deck2wins = 0;
        for (int i=0; i<cardDeck1.size(); i++) {
            deck1wins+=cardDeck1.get(i).getColor();
            deck2wins+=cardDeck2.get(i).getColor();
        }
        if (deck1wins < deck2wins) return -1;
        else if (deck1wins > deck2wins) return 1;
        else return 0;
    }

    /*
    //TEST
    public static void main(String[] args) {
        ArrayList<Card> cardDeck1= new ArrayList<>();
        ArrayList<Card> cardDeck2= new ArrayList<>();

        cardDeck1.add(new Card(1,1,false));
        cardDeck1.add(new Card(3,4,true));
        cardDeck2.add(new Card(1,1,true));
        cardDeck2.add(new Card(5,2,false));

        for(Card c:cardDeck1) System.out.println(c.getColor());
        for(Card c:cardDeck2) System.out.println(c.getColor());

        System.out.println(battle(cardDeck1, cardDeck2));
    }
     */
}
