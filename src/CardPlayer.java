public abstract class CardPlayer implements CardPlayerBehavior {
    protected Card[] hand;
    protected int cardCount;

    public CardPlayer(int max_cards) {
        hand = new Card[max_cards];
        cardCount = 0;
    }

    public boolean receiveCard(Card c) {
        if (cardCount < hand.length) {
            hand[cardCount++] = c;
            return true;
        }
        return false;
    }

    public Card[] showCards() {
        return hand;
    }

    public int totalScore() {
        int score = 0;
        for (int i = 0; i < cardCount; i++) {
            score += Math.min(hand[i].getRank(), 10); // Face cards are worth 10 points
        }
        return score;
    }
}
