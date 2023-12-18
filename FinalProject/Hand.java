import java.util.*;

public class Hand{
	private ArrayList<Card> hand;
	
	Hand(){
		hand = new ArrayList<Card>();
	}
	
	public void addDrawnCard(Deck deck){
		hand.add(deck.drawCard());
	}
	
	public int totalHand(){
		int handValue = 0;
		int aceCount = 0;
		
		for(Card card: hand){
			handValue += card.getRank().getCardValue();
			
			if(card.getRank().getCardValue() == 11){
				aceCount ++;
			}
		}
		if(handValue < 21 && aceCount > 0){
			while(handValue + 10 <= 21)
			handValue += 10;
		}
		return handValue;
	}
	public String toString(){
		String output ="";
		for(Card card: hand){
			output += card + " - ";
		}
		return output;
	}
	
	public Card getCard(int index){
		return hand.get(index);
	}
	
	public void emptyHand(){
		this.hand.clear();
	}
}
