import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Game{
    private ArrayList<Card> collection;

    public Deck() {
        this.collection = new ArrayList<>();
    }

    public int cardsCount() {
        return collection.size();
    }

    public void addCard(Card card) {
        this.collection.add(card);
    }

    public void populateDeck() {
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
        String index = collection.get(element).getCardName();
        return index;
    }

    public Card removeFirstCard() {
        int firstCardIndex = 0;
        Card removedCard = this.collection.remove(firstCardIndex);
        return removedCard;
    }

    public void shuffleDeck() {
        Collections.shuffle(collection);
    }

    public void getDeckReadyToPlay() {
        populateDeck();
        shuffleDeck();
    }

    public void dealCardToPlayer() {
        dealCard(removeFirstCard());
    }

    public void runAGame() {
        getDeckReadyToPlay();
        dealCardToPlayer();
        dealCardToPlayer();
        System.out.println("Player1: " + getPlayer1CardByIndex(0) + " Player2: " + getPlayer2CardByIndex(0) + "  " + compareValues());
    }
}
