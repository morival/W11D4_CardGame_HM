import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp() {
        card = new Card(RankType.SEVEN, SuitType.HEARTS);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.SEVEN, card.getRank());
    }

    @Test
    public  void sevenHasValueOf7() {
        assertEquals(7, card.getValueFromRank());
    }

    @Test
    public void sevenOfHeartsHasValueOf7Hearts() {
        assertEquals("SEVEN OF HEARTS", card.getCardName());
    }
}
