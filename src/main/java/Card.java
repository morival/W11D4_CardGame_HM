public class Card {

    private RankType rank;
    private SuitType suit;

    public Card(RankType rank, SuitType suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public RankType getRank() {
        return rank;
    }

    public SuitType getSuit() {
        return suit;
    }

    public int getValueFromRank() {
        return this.rank.getValue();
    }

    public String getCardValue() {
        return rank + " OF " + suit;
    }

    public Card getCard() {
        return new Card(rank, suit);
    }
}
