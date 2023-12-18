import java.util.*;

class BlackJackGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String playName;
		System.out.println("Welcome to Blackjack!");
		
	Game game = new Game();
		
	}
}

class Game {
	private Deck deck;
	private Deck discard;
	private Dealer dealer;
	private Player player;
	Scanner input = new Scanner(System.in);
		
	public Game(){
		deck = new Deck(true);
		discard = new Deck(false);
		
		dealer = new Dealer();
		player = new Player();
		
		deck.shuffleDeck(deck);
		startRound();
	}

	private void startRound(){
		dealer.getHand().addDrawnCard(deck);
		dealer.getHand().addDrawnCard(deck);
		
		player.getHand().addDrawnCard(deck);
		player.getHand().addDrawnCard(deck);
		
		dealer.printDealerHand();
		player.printHand();
		
		if(dealer.Blackjack()){
			dealer.printHand();
			if(player.Blackjack()){
				System.out.println("You both have 21. Tie.");
				continueGame();
			}
			else{
				System.out.println("Dealer Blackjack. You lose.");
				continueGame();
			}
		}
		if(player.Blackjack()){
			System.out.println("You have Blackjack! You win!");
			continueGame();
		}
		
		player.makeDecision(deck, discard);
		
		if(player.getHand().totalHand() > 21){
			System.out.println("You have gone over 21! Bust!");
			continueGame();
		}
		dealer.printHand();
		while(dealer.getHand().totalHand() < 17){
			dealer.hit(deck, discard);
		}
		
		if(dealer.getHand().totalHand() > 21){
			System.out.println("Dealer busts! You Win!");
		}
		else if(dealer.getHand().totalHand() > player.getHand().totalHand()){
			System.out.println("You lose!");
		}
		else if(dealer.getHand().totalHand() < player.getHand().totalHand()) {
			System.out.println("You win!");
		}
		else{
			System.out.println("Tie.");
		}
		continueGame();
	}
	private void continueGame(){
		int playerDecision = 0;
		
		while(playerDecision != 1 && playerDecision != 2){
			System.out.println("Would you like to play again?");
			System.out.println("1 - Yes \n2 - No");
			playerDecision = input.nextInt();}
		
		if(playerDecision == 1){
			player.getHand().emptyHand();
			dealer.getHand().emptyHand();
			if(deck.numberOfCards() < 4){
				deck = new Deck(true);
				deck.shuffleDeck(deck);
			}
			startRound();
		}
		else if(playerDecision == 2){
			System.out.println("Goodbye!");
			System.exit(0);
		}
		else{
			System.out.println("Invalid. Please enter a valid input");
		}
	}

	}
	