import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> collection;

    public Deck() {
        this.collection = new ArrayList<Card>();
    }

    public int cardsCount() {
        for(Card card: collection) {
            System.out.println(card);}
        return collection.size();
    }

    public void addCard(Card card) {
        this.collection.add(card);
    }
}
