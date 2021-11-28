import java.util.*;

public class ComputerPlayer extends Player {

    private Mode mode;
    private int waitTime;

    public ComputerPlayer(ArrayList<Card> deck, Mode mode) {
        super(deck);
        this.mode = mode;

        this.waitTime = switch (mode) {
            case EASY -> 100;
            case MEDIUM -> 75;
            case HARD -> 50;
            default -> 25;
        };

    }

    public Mode getMode() { return this.mode; }

    public void setMode(Mode mode) { this.mode = mode; }

    public int getWaitTime() { return this.waitTime; }

    public void setWaitTime(int waitTime) { this.waitTime = waitTime; }

}
