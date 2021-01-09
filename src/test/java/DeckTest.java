import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Card sevenOfHearts;


    @Before
    public void setUp() {
        deck = new Deck();
        Card sevenOfHearts = new Card(RankType.SEVEN, SuitType.HEARTS);
    }

    @Test
    public void canGetNumberOfCardsInDeck() {
        assertEquals(0, deck.cardsCount());
    }

    @Test
    public void canAddCardToDeck() {
        deck.addCard(sevenOfHearts);
        assertEquals(1, deck.cardsCount());
    }

    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.cardsCount());
//        assertEquals("ACE OF HEARTS", deck.get(0).getCardValue());
    }

    @Test
    public void canGetCardByIndex() {
        deck.populateDeck();
        String result = deck.getCardByIndex(0);
        assertEquals("ACE OF HEARTS", result);
    }

    @Test
    public void canRemoveFirstCardFromDeck() {
        deck.populateDeck();
        deck.removeFirstCard();
        String result = deck.getCardByIndex(0);
        assertEquals("ACE OF SPADES", result);
        assertEquals(51, deck.cardsCount());
    }

    @Test
    public void canShuffleDeck() { //first card is not ace of hearts
        deck.populateDeck();
        deck.shuffleDeck();
        String result = deck.getCardByIndex(0);
        assertNotEquals("ACE OF HEARTS", result);
    }

}
