import java.util.*;

public class Hand{
	private ArrayList<Card> hand;
	
	Hand(){
		hand = new ArrayList<Card>();
	}
	
	public void addDrawnCard(){
		hand.add(deck.drawCard());
	}
	
	public int totalHand(){
		int handValue;
		int aceCount;
		
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
}