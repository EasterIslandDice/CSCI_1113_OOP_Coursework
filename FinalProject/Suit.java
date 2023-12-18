public enum Suit{
	HEARTS("Hearts"), 
	SPADES("Spades"), 
	CLUBS("Clubs"), 
	DIAMONDS("Diamonds");
	
	String suitName;
	
	Suit(String suitName){
		this.suitName = suitName;
	}
	
	public String toString(){
		return suitName;
	}
}