import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
//    ArrayList<Card> newDeck;
    Card sevenOfHearts;
    Card aceOfClubs;

    @Before
    public void setUp() {
        game = new Game();
//        newDeck = new ArrayList<>();
        sevenOfHearts = new Card(RankType.SEVEN, SuitType.HEARTS);
        aceOfClubs = new Card(RankType.ACE, SuitType.CLUBS);
    }

    @Test
    public void getNumberOfCardsInPlayersHand() {
        assertEquals(0, game.cardCountPlayer1());
        assertEquals(0, game.cardCountPlayer2());
    }

    @Test
    public void canAddCardToPlayer1() {
        game.addCardToPlayer1(sevenOfHearts);
        assertEquals(1, game.cardCountPlayer1());
    }

    @Test
    public void canGetPlayersCardByIndex() {
        game.addCardToPlayer1(sevenOfHearts);
        game.addCardToPlayer2(aceOfClubs);
        String result1 = game.getPlayer1CardByIndex(0);
        String result2 = game.getPlayer2CardByIndex(0);
        assertEquals("SEVEN OF HEARTS", result1);
        assertEquals("ACE OF CLUBS", result2);
    }



}
