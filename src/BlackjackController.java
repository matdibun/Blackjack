public class BlackjackController {
    private Dealer dealer;
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;

    public BlackjackController(Dealer dealer) {
        this.dealer = dealer;
        this.humanPlayer = new HumanPlayer(10, "Player");
        this.computerPlayer = new ComputerPlayer(10);
    }

    public void manageBlackjack() {
        // Initial card dealing
        dealer.dealOneTo(humanPlayer);
        dealer.dealOneTo(computerPlayer);
        dealer.dealOneTo(humanPlayer);
        dealer.dealOneTo(computerPlayer);

        // Dealer deals additional cards to each player
        dealer.dealTo(humanPlayer);
        dealer.dealTo(computerPlayer);
        dealer.dealTo(dealer);

        // Determine the winner
        int playerScore = humanPlayer.totalScore();
        int computerScore = computerPlayer.totalScore();
        int dealerScore = dealer.totalScore();

        System.out.println("Player's score: " + playerScore);
        System.out.println("Computer's score: " + computerScore);
        System.out.println("Dealer's score: " + dealerScore);

        if (playerScore > 21) humanPlayer.youLose();
        else if (dealerScore > 21 || playerScore > dealerScore) humanPlayer.youWin();
        else humanPlayer.youLose();

        if (computerScore > 21) System.out.println("Computer busts.");
        else if (dealerScore > 21 || computerScore > dealerScore) System.out.println("Computer wins!");
        else System.out.println("Dealer wins!");
    }
}
