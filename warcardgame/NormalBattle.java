package warcardgame;

import java.util.ArrayList;


public class NormalBattle implements Battle{

    public static int battle(ArrayList<Card> cardDeck1, ArrayList<Card> cardDeck2) {


        for (int i = 0; i <= cardDeck1.size(); i++) {

            int deck1card = 0;
            int deck2card = 0;

            if (cardDeck1.get(deck1card).getValue() > cardDeck2.get(deck2card).getValue()) {
                if (cardDeck2.iterator().hasNext()) deck2card++;
                else return 1;
            }

            if (cardDeck1.get(deck1card).getValue() < cardDeck2.get(deck2card).getValue()) {
                if (cardDeck1.iterator().hasNext()) deck1card++;
                else return -1;
            }
        }
        return 0;
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

        for(Card c:cardDeck1) System.out.print(c.getValue() + " ");
        System.out.println();
        for(Card c:cardDeck2) System.out.print(c.getValue()+ " ");

        System.out.println();
        System.out.println(battle(cardDeck1, cardDeck2));
    }
     */
}


