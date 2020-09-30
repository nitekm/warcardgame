package warcardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WarTest {
    public static void main(String[] args) {

        int seed = 10;
        int deckSize = 5;
        List<Card> cardDeck1 = new ArrayList<>();
        List<Card> cardDeck2 = new ArrayList<>();
        Random rValue = new Random();
        Random rColor = new Random();
        Random rRarity = new Random();

        for (int i = 0; i <= deckSize; i++) {
            cardDeck1.add(new Card(rValue.nextInt(10), rColor.nextInt(4), rRarity.nextBoolean()));
        }

        RarityBattle.battle(cardDeck1, cardDeck2);

    }
}