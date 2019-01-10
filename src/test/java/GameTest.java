import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Deck deck;
    private Game game;
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private ArrayList<Player> players;

    @Before
    public void before(){
        deck = new Deck();
        player1 = new Player("Graeme");
        player2 = new Player("Jake");
        player3 = new Player("Stalin");
        player4 = new Player("Franco");

        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        game = new Game(players, deck);
    }

    @Test
    public void hasPlayers(){
        assertEquals(4, game.getPlayers().size());
    }

    @Test
    public void hasEmptyDeck(){
        assertEquals(0, game.getDeck().getCards().size());
    }


    @Test
    public void startingGameDealsCards(){
        game.start();
        assertEquals(2, player1.getHand().size());
        assertEquals(2, player2.getHand().size());
    }

    @Test
    public void startingGameShowsWinner(){
        assertEquals("Graeme wins", game.start());
    }
}
