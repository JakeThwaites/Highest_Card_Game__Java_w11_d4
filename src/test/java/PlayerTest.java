import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Deck deck;

    @Before
    public void before(){
        player1 = new Player("Graeme");
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void playerHasName(){
        assertEquals("Graeme", player1.getName());
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, player1.getHand().size());
    }

    @Test
    public void playerCanTakeCard(){
        Card card = deck.deal();
        assertEquals(0, player1.getHand().size());
        player1.takeCard(card);
        assertEquals(1, player1.getHand().size());
    }

    @Test
    public void playerCanShowHand(){
        Card card = deck.deal();
        player1.takeCard(card);
        assertEquals(card.getSuit(), player1.showHand().getSuit());
        assertEquals(card.getRank(), player1.showHand().getRank());
    }

}
