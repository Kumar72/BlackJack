package blackJack;

public class Player {

	Hand hand = new Hand();
	//fields
	private String name;
	private Integer wallet;

	
	//ctor
	public Player(String name, Integer wallet) {
		this.name = name;
		//this.hand = hand;  		//needs to be random
		this.wallet = wallet;
	}
	
	//---------------------------METHODS----------------------//
	
	public void PlayerDeck() {
		//add 2 cards to the player
		Deck p1 = new Deck();
	}
	
	public void DealerDeck() {
		//add two cards to the dealer
		Deck dealer = new Deck();
	}
	
	
	public void placeWager (int Wager) {
		double placeMoney;
	}
	
	
	//-----Getters Setters & toString

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player name: ");
		builder.append(name);
		builder.append("\nHand: ");
		builder.append(hand);
		builder.append("\nWallet: $");
		builder.append(wallet);
		builder.append("\n");
		return builder.toString();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Hand getHand() {
		
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Integer getWallet() {
		return wallet;
	}

	public void setWallet(Integer wallet) {
		this.wallet = wallet;
	}

	public Player()  {
		
	}
	
	
}
