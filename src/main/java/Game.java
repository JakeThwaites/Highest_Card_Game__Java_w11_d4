import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private Deck deck;

    public Game(ArrayList<Player> players, Deck deck){
        this.players = players;
        this.deck = deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Deck getDeck() {
        return deck;
    }

    public void dealCards(){
        for (Player player : players){
            player.takeCard(deck.deal());
        }
    }

    public String start(){
        deck.populate();
        deck.shuffle();
        dealCards();
        return showWinner();
    }

    public String showWinner(){
        int highCard = 0;
        ArrayList<Player> winners = new ArrayList<>();

        for (Player player : players){
            int handValue = player.showHand().getRank().getValue();


            if (handValue == highCard) {
                winners.add(player);
            }
            if (handValue > highCard){
                highCard = handValue;
                winners.clear();
                winners.add(player);
            }
        }

        if (winners.size() > 1) {
            String winnersString = createWinnersString(winners);
            return winnersString;
        }
       else
           { return winners.get(0).getName() + " wins";
        }
    }

    public String createWinnersString(ArrayList<Player> winners){
        String winnersString = "";
        for (Player winner : winners) {
            winnersString += winner.getName() + ", ";
        }
        return winnersString.concat("you are a drawing bunch!");
    }
}
