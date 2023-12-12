import java.util.*;

public class Deck{
	private ArrayList<Card> deck;
	
	Deck(){
		deck = new ArrayList<Card>(52);
		for(Suit s : Suit.values()) {
			for(Rank r : Rank.values()){
				deck.add(new Card(s, r));
			}
		}
	}
}