import static org.junit.Assert.*;
        import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void canGetCardValue(){
        assertEquals(1, card.getRank().getValue());
    }

    @Test
    public void howManyRanksAreThere(){
        assertEquals(13, RankType.values().length);
    }



//    @Test
//    public void suitCanBeMisspelled(){
//        card = new Card("hearts");
//        assertEquals("hearts", card.getSuit());
//    }
}