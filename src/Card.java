public class Card {

    private Colors color;
    private Suits suit;
    private int num;
    private boolean faceCard;
    private Rank rank;

    public Card(Colors color, Suits suit, int num, boolean faceCard) {
        this.color = color;
        this.suit = suit;
        this.num = num;
        this.faceCard = faceCard;

        if(num > 10) {
            rank = switch (num) {
                case 11 -> Rank.JACK;
                case 12 -> Rank.QUEEN;
                case 13 -> Rank.KING;
                case 14 -> Rank.ACE;
                default -> Rank.NUM;
            };
        }
    }

    public Colors getColor() {
        return this.color;
    }

    public Suits getSuit() {
        return this.suit;
    }

    public int getNum() {
        return this.num;
    }

    public boolean getFaceCard() {
        return this.faceCard;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setFaceCard(boolean faceCard) {
        this.faceCard = faceCard;
    }

    public String toString() {
        return this.color + " " +
                this.rank + " " +
                this.suit;
    }


}