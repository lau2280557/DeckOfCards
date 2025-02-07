package cards;

public class Card {
    private Suit suit;
    private FaceValue value;

    public Card(Suit suit, FaceValue value) {
        this.suit = suit;
        this.value = value;
    }
    public int compareTo(Card card) {
        return value.ordinal() - card.value.ordinal();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            return equals((Card) obj);
        }
        return false;
    }

    public Suit getSuit() {
        return suit;
    }

    public FaceValue getValue() {
        return value;
    }

    public int hashCode() {
        return value.ordinal();
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public void setValue(FaceValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
