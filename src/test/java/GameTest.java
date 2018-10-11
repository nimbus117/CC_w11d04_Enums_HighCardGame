import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameTest {

    Game game;
    int numberOfPlayers;

    @Before
    public void before() {
        numberOfPlayers = 52;
        game = new Game(numberOfPlayers);
    }

    @Test
    public void getPlayer1CardReturnsNull(){
        assertEquals(null, game.getPlayerCard(1));
    }

    @Test
    public void getPlayer2CardReturnsNull(){
        assertEquals(null, game.getPlayerCard(2));
    }

    @Test
    public void hasFullDeck(){
        assertEquals(52, game.countCardsLeftInDeck());
    }


    @Test
    public void dealCards(){
        game.dealCards();
        assertEquals(52 - numberOfPlayers, game.countCardsLeftInDeck());
        assertNotNull(game.getPlayerCard(1));
        assertNotNull(game.getPlayerCard(2));
    }

    @Test
    public void checkWinner(){
        game.dealCards();
        assertTrue(game.checkWinner() > 0);
    }



}
