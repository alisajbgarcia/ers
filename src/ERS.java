import java.util.*;

public class ERS {

    private Player player1;
    private Player player2;

    public ERS(Player player1, Player palyer2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() { return this.player1; }

    public Player getPlayer2() { return this.player2; }

    public void setPlayer1(Player player1) { this.player1 = player1; }

    public void setPlayer2(Player player2) { this.player2 = player2; }

    public static void shuffleCards(ArrayList<Card> deck1, ArrayList<Card> deck2) {

    }

    public static void setUpCards() {
        ArrayList<Card> startDeck = new ArrayList<Card>();

        Colors color;
        Suits suit;
        int num;
        boolean faceCard;

        for (int i = 0; i < 52; i++) {

            num = (i % 13) + 2;
            suit = switch(i / 13) {
                case 0 -> Suits.CLUB;
                case 1 -> Suits.SPADE;
                case 2 -> Suits.HEART;
                default -> Suits.DIAMOND;
            };

            color = i < 26 ? Colors.BLACK : Colors.RED;

            Card card = new Card(color, suit, num);

            startDeck.add(card);

        }

        int randShuffle = (int) Math.round((Math.random() * 5) + 5);
    }


    public void gamePlay() {

    }
}
