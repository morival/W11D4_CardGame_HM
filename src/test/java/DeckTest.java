import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
