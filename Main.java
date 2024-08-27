import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        
        List<Card> drawnCards = deck.drawCards(20);
        
        System.out.println("Before Sorting:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }
        
        Collections.sort(drawnCards, new CardComparator());
        
        System.out.println("\nAfter Sorting:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }
    }
}
