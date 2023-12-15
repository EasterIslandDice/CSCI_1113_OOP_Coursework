public class player{
	private Hand hand;
	private String name;
	
	public player(){
		this.hand = new Hand();
		this.name = "";
	}
	public Hand getHand(){
		return this.hand;
	}
	public void setHand(Hand hand){
		this.hand = hand;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
}

	public boolean Blackjack(){
		if(this.getHand().totalHand() == 21){
			return true;
		}
		else {
			return false;
		}
	}
}