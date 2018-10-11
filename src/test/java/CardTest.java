import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test
    public void hasSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.ACE, card.getRank());
        assertEquals(1, card.getRank().getValue());
    }


}
