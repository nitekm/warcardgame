package warcardgame;

import java.util.ArrayList;
import java.util.Random;

public class WarTest {
    public static void main(String[] args) {

        int seed1 = 15;
        //int seed2 = 15;
        int deckSize = 5;
        ArrayList<Card> cardDeck1 = new ArrayList<>();
        ArrayList<Card> cardDeck2 = new ArrayList<>();
        Random rValue = new Random();
        Random rColor = new Random();
        Random rRarity = new Random();




        System.out.print("\nDeck with " + deckSize + " cards, seed " + seed1 + ": ");
        for (int i = 0; i <= deckSize; i++) {
            cardDeck1.add(new Card(rValue.nextInt(seed1) + 1, rColor.nextInt(4) + 1, rRarity.nextBoolean()));
            System.out.print("(" + cardDeck1.get(i).getValue() + ", " + cardDeck1.get(i).getColor() + ", " + cardDeck1.get(i).isRare() + ")");
        }

        System.out.print("\nDeck with " + deckSize + " cards, seed " + seed1 + ": ");
        for (int i = 0; i <= deckSize; i++) {
            cardDeck2.add(new Card(rValue.nextInt(seed1) +1, rColor.nextInt(4)+1, rRarity.nextBoolean()));
            System.out.print("(" + cardDeck2.get(i).getValue() + ", " + cardDeck2.get(i).getColor() + ", " + cardDeck2.get(i).isRare() + ")");
        }

        System.out.println();
        System.out.println("Rarity battle result: "+ RarityBattle.battle(cardDeck1, cardDeck2));
        System.out.println("Color battle result: "+ ColorBattle.battle(cardDeck1, cardDeck2));
        System.out.println("Normal battle result: "+ NormalBattle.battle(cardDeck1, cardDeck2));

    }
}