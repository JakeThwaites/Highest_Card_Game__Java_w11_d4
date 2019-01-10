import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeckTest {
    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
     assertEquals(0, deck.getCards().size());
    }

    @Test
    public void deckCanPopulateCards(){
        deck.populate();
        assertEquals(52, deck.getCards().size() );
    }

    @Test
    public void deckActuallyHasCards(){
        deck.populate();
        Card card = new Card(SuitType.HEARTS, RankType.ACE);
        Card testCard = deck.deal();
        assertEquals(card.getRank(), testCard.getRank());
        assertEquals(card.getSuit(), testCard.getSuit());
    }

//    @Test
//    public void deckCanShuffle(){
//        deck.populate();
//        deck.shuffle();
//        Card card = new Card(SuitType.HEARTS, RankType.ACE);
//        Card testCard = deck.deal();
//        assertEquals(card.getRank(), testCard.getRank());
//        assertEquals(card.getSuit(), testCard.getSuit());
//    }
}
