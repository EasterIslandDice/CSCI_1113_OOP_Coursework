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
	
	void ShuffleDeck(ArrayList<Card> deck){
		Collections.shuffle(deck);
	}
	
	public Card drawCard(){
			Card drawnCard = this.deck.get(0);
			this.deck.remove(0);
			return drawnCard;
		}
}