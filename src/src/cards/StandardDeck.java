package cards;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardDeck implements Deck {

    private List<Card> cards;

    public StandardDeck() {
        this.cards = newDeck();
    }

    private List<Card> newDeck() {
        List<Card> newDeck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (FaceValue value : FaceValue.values()) {
                newDeck.add(new Card(suit, value));
            }
        }

        return newDeck;
    }


    @Override
    public void cut(int index) {
        List<Card> newDeck = new ArrayList<>();
        newDeck.addAll(this.cards.subList(index, this.cards.size()));
        newDeck.addAll(this.cards.subList(0, index));
        this.cards = newDeck;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(this.cards);

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public Card turnOver() {
        return null;
    }

    @Override
    public void newOrder(Deck cards) {

    }

    @Override
    public int search(Card card) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Card draw() {
        return null;
    }

    @Override
    public int newSize() throws OperationNotSupportedException {
        return Deck.super.newSize();
    }
}
