import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        // Compare by color
        int colorComparison = getColorValue(c1) - getColorValue(c2);
        if (colorComparison != 0) {
            return colorComparison;
        }

        // Compare by suit within color
        int suitComparison = c1.getSuit().compareTo(c2.getSuit());
        if (suitComparison != 0) {
            return suitComparison;
        }

        // Compare by card value
        return c1.getRank().ordinal() - c2.getRank().ordinal();
    }

    private int getColorValue(Card card) {
        return (card.getSuit() == Suit.SPADE || card.getSuit() == Suit.CLUB) ? 0 : 1;
    }
}
