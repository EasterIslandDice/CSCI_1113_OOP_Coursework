import java.util.*;

public class Deck{
	private ArrayList<Card> deck;
	
	Deck(boolean full){
		deck = new ArrayList<Card>();
		if(full){
		for(Suit s : Suit.values()) {
			for(Rank r : Rank.values()){
				deck.add(new Card(s, r));
			}
			}
		}
	}
	
	void shuffleDeck(Deck deck){
		Collections.shuffle(this.deck, new Random());
	}
	
	public Card drawCard(){
			Card drawnCard = this.deck.get(0);
			this.deck.remove(0);
			return drawnCard;
		}
	public int numberOfCards(){
		return deck.size();
		
	}
	
}