import java.util.*;

public class Player {
    private ArrayList<Card> deck;

    public Player(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getDeck() {
        return this.deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public boolean win() {
        return deck.size() == 52;
    }
}
