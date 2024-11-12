public class Blackjack {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        Dealer dealer = new Dealer(deck);
        BlackjackController controller = new BlackjackController(dealer);

        controller.manageBlackjack();
    }
}
