import java.util.*;

public class Player{
	Hand hand;
	private String name;
	Scanner input = new Scanner(System.in);
	
	public Player(){
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
	
	public void printHand(){
		System.out.println(this.name +"'s hand:");
		System.out.println(this.hand + "\nValue: " + this.hand.totalHand());
	}
	
	public void makeDecision(Deck deck, Deck discard){
		int decision = 0;
		boolean getInput = true;
		
		while(getInput == true){
			try{
				System.out.println("Do you want to hit or stand?");
				System.out.println("1 - Hit \n2 - Stand");
				decision = input.nextInt();
				getInput = false;
			}
			catch(Exception e){
				System.out.println("Invalid");
				input.next();
			}
		if(decision == 1){
			this.hit(deck, discard);
			if(this.getHand().totalHand() > 20){
				return;
			}
			else{
				this.makeDecision(deck, discard);
			}
		}
			else{
				System.out.println("You stand.");
			}
		}
	}
	public void hit(Deck deck, Deck discard){
		if(deck.numberOfCards() < 1){
			System.out.println("Deck has no cards!");
			deck = new Deck(true);
			deck.shuffleDeck(deck);
		}
		this.hand.addDrawnCard(deck);
		System.out.println(this.name + " gets a card.");
		this.printHand();
	}
}
