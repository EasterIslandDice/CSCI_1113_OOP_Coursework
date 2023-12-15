public enum Rank{
	ACE("Ace", 1),
	DEUCE("Deuce", 2),
	THREE("Three", 3),
	FOUR("Four", 4),
	FIVE("Five", 5),
	SIX("Six", 6),
	SEVEN("Seven", 7),
	EIGHT("Eight", 8),
	NINE("Nine", 9),
	TEN("Ten", 10),
	JACK("Jack", 10),
	QUEEN("Queen", 10),
	KING("King", 10);
	
	private int cardValue;
	private String cardName;
	
	private Rank(String cardName, int cardValue){
		this.cardValue = cardValue;
		this.cardName = cardName;
	}
	
	public int getCardValue(){
		return cardValue;
	}

	public String toString(){
		return cardName;
	}
}
