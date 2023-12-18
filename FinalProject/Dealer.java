public class Dealer extends Player{
	public Dealer(){
		super.setName("Dealer");
	}
	public void printDealerHand(){
		System.out.println("The dealer's hand:");
		System.out.println(super.getHand().getCard(0));
		System.out.println("One card hidden.");
	}
}