package cards;

import javax.naming.OperationNotSupportedException;

public interface Deck {
    void cut(int index);
    void shuffle();
    Card deal();
    Card turnOver();
    void newOrder(Deck cards);
    int search(Card card);
    int size();
    Card draw();

    default int newSize() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Not implemented");
    }

}
