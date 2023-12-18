import java.util.*;

public class Card{
	private Suit suit;
	private Rank rank;
	
	Card(){
		
	}
	
	Card(Suit suit, Rank rank){
		this.suit = suit;
		this.rank = rank;
	}
	
	public Suit getSuit(){
		return suit;
	}
	public Rank getRank(){
		return rank;
	}
	public int getValue(){
		return rank.getCardValue();
	}
	
	public String toString(){
		return rank + " of " + suit + "(" + this.getValue() + ")";
	}
	
}
