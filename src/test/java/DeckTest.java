import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void hasEmptyDeck(){
        assertEquals(0, deck.countCardsInDeck());
    }

    @Test
    public void hasFullDeck(){
        deck.populate();
        assertEquals(52, deck.countCardsInDeck());
    }

    @Test
    public void canDealCard(){
        deck.populate();
        Card card = deck.dealCard();
        assertEquals(51, deck.countCardsInDeck());
        assertTrue(card instanceof Card);
    }





    //    @Test
//    public void canShuffle(){
//        deck.populate();
//        assertEquals(52, deck.countCardsInDeck());
//    }
//
//    @Test
//    public void canDeal(){
//        deck.populate();
//        assertEquals(52, deck.countCardsInDeck());
//    }


//    @Test
//    public void hasAllHearts(){
//        deck.populate();
//        assertEquals(13, deck.countCardsOfSuit(Suit.HEARTS));
//    }
//
//    @Test
//    public void hasFourFours(){
//        deck.populate();
//        assertEquals(4, deck.countCardsOfRank(Rank.FOUR));
//    }


}
