import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> collection;

    public Deck() {
        this.collection = new ArrayList<Card>();
    }

    public int cardsCount() {
        return collection.size();
    }

    public void addCard(Card card) {
        this.collection.add(card);
    }

    public void populateDeck() {
        ArrayList<Card> cards = new ArrayList<Card>();
        for (RankType rank : RankType.values()) {
            for(SuitType suit : SuitType.values()) {
                this.collection.add(new Card(rank, suit));
//                System.out.println(new Card(rank, suit).getCardValue());
            }
        }
//        System.out.println(collection.get(0).getCardValue());
    }

    public String getCardByIndex(int element) {
//        System.out.println(collection.get(element).getCardValue());
        String index = collection.get(element).getCardValue();
        return index;
    }

    public void removeFirstCard() {
        int firstCard = 0;
        this.collection.remove(firstCard);
    }

    public void shuffleDeck() {
        Collections.shuffle(collection);
    }


}
