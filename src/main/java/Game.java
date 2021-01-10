import java.util.ArrayList;

public class Game {
    private ArrayList<Card> player1;
    private ArrayList<Card> player2;
    private ArrayList<Card> readyDeck;

    public Game() {
        this.player1 = new ArrayList<>();
        this.player2 = new ArrayList<>();
        this.readyDeck = new ArrayList<>();
    }



    public int cardCountPlayer1() {
        return player1.size();
    }

    public int cardCountPlayer2() {
        return player2.size();
    }

    public void addCardToPlayer1(Card card) {
        this.player1.add(card);
    }

    public void addCardToPlayer2(Card card) {
        this.player2.add(card);
    }

    public void dealCard(Card card) {
        if(player1.size() == 0) {
            this.player1.add(card);
//            System.out.println(player1.get(0).getCardValue());
        } else {
            this.player2.add(card);
//            System.out.println(player2.get(0).getCardValue());
        }

    }

    public String getPlayer1CardByIndex(int element) {
        String index = player1.get(element).getCardName();
        return index;
    }

    public String getPlayer2CardByIndex(int element) {
        String index = player2.get(element).getCardName();
        return index;
    }

    public Card getPlayer1Card() {
        return player1.get(0);
    }

    public Card getPlayer2Card() {
        return player2.get(0);
    }

    public String compareValues() {
        if (getPlayer1Card().getValueFromRank() > getPlayer2Card().getValueFromRank()) {
            return "Player 1 Won!";
        } else if (getPlayer1Card().getValueFromRank() < getPlayer2Card().getValueFromRank()) {
            return "Player 2 Won!";
        } else {
            return "It's a Draw!";
        }
    }
}
