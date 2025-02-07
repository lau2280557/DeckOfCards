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
    public void shuffle() {
        Collections.shuffle(this.cards);

    }

    @Override
    public void cut(int index) {
        List<Card> top = this.cards.subList(0, index);
        List<Card> bottom = this.cards.subList(index, this.cards.size());

        this.cards.clear();

        this.cards.addAll(bottom);
        this.cards.addAll(top);
    }

    @Override
    public Card deal() {
        return this.cards.remove(0);
    }

    @Override
    public Card turnOver() {
        return this.cards.get(0);
    }

    @Override
    public void newOrder(Deck cards) {
        //fix me: method should sorting the cards passed in
        //Collections.sort(this.cards);
    }

    @Override
    public int search(Card card) {
        return cards.indexOf(card);
    }

    @Override
    public int size() {
        return this.cards.size();
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
