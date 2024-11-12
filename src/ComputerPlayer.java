public class ComputerPlayer extends CardPlayer {
    public ComputerPlayer(int max_cards) {
        super(max_cards);
    }

    @Override
    public boolean wantsACard() {
        return totalScore() < 17; // Computer player hits until 17
    }
}
