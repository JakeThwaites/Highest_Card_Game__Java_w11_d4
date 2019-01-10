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
        Card highestCard = getHighestCard();
        return highestCard;
    }

    public Card getHighestCard() {
        Card highCard = new Card(SuitType.DIAMONDS, RankType.ACE);
        for (Card card : this.hand) {
            if (card.getRank().getValue() >= highCard.getRank().getValue()) {
                highCard = card;
            }
        }
        return highCard;
    }
}
