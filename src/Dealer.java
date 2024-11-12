public class Dealer extends CardPlayer {
    private CardDeck deck;

    public Dealer(CardDeck deck) {
        super(10); // Assuming a maximum of 10 cards in hand
        this.deck = deck;
    }

    @Override
    public boolean wantsACard() {
        return totalScore() < 17;
    }

    public void dealTo(CardPlayerBehavior player) {
        while (player.wantsACard()) {
            dealOneTo(player);
        }
    }

    public void dealOneTo(CardPlayerBehavior player) {
        Card card = deck.newCard();
        if (card != null) {
            player.receiveCard(card);
        }
    }
}
