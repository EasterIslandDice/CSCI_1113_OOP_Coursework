import java.util.*;

class BlackJackGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Player player = new Player();
		Player dealer = new Player();
		
		System.out.println("Welcome to Blackjack!");
		System.out.println("Please enter your name:");
		String playName = input.nextLine();
		player.setName(playName);


	}
}