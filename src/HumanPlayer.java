public class HumanPlayer extends CardPlayer {
    private String name;
    private int chips;

    public HumanPlayer(int max_cards, String name) {
        super(max_cards);
        this.name = name;
        this.chips = 100; // Default starting chips
    }

    @Override
    public boolean wantsACard() {
        // Normally would ask the player, but here we will simulate by returning true
        return totalScore() < 17; // Replace with player input in a real game
    }

    public void youWin() {
        System.out.println(name + " wins!");
        chips += 10;
    }

    public void youLose() {
        System.out.println(name + " loses.");
        chips -= 10;
    }

    public int countChips() {
        return chips;
    }
}
