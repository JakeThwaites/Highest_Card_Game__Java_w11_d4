import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }


    public ArrayList<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public void takeCard(Card card) {
        this.hand.add(card);
    }

    public Card showHand() {
        return this.hand.get(0);
    }
}
