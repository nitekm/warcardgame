package warcardgame;

import java.util.ArrayList;
import java.util.List;

public class RarityBattle implements Battle {


    public static int battle(List<Card> cardDeck1, List<Card> cardDeck2) {
        int deck1wins = 0;
        int deck2wins = 0;
        for (int i=0; i<cardDeck1.size(); i++) {
            if (cardDeck1.get(i).isRare() && cardDeck2.get(i).isRare() == false) deck1wins++;
            if (cardDeck1.get(i).isRare() == false && cardDeck2.get(i).isRare()) deck2wins++;;
        }
        if (deck1wins < deck2wins) return -1;
        else if (deck1wins > deck2wins) return 1;
        else return 0;
    }

    /*
    //TEST
    public static void main(String[] args) {
        cardDeck1.add(new Card(1,1,false));
        cardDeck2.add(new Card(1,1,true));

        System.out.println(battle(cardDeck1, cardDeck2));

    }
     */
}

