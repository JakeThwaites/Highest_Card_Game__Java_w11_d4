import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    };

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void populate(){
        ArrayList<Card> allCards = new ArrayList<>();
        for (RankType rank : RankType.values()){
            for (SuitType suit : SuitType.values()){
                 Card newCard = new Card(suit, rank);
                 allCards.add(newCard);
            }
        }
        cards = allCards;
    }

    public Card deal(){
        return cards.remove(0);
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
}
