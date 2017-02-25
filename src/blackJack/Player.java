package blackJack;

import java.util.List;

public class Player {

	
	Hand hand = new Hand();
	//fields
	private String name;
	private Double wallet;
	private Double bet;


	
	//ctor
	public Player(String name, Double wallet) {
		this.name = name;
		//this.hand = hand;  		//needs to be random
		this.wallet = wallet;
	}
	
	public Player() {
		
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
	
	public void hit(List<Card> card) {
		hand.addCard(card);
	}
	
	public boolean bust () {
		if(hand.getTotal() > 21) {
			return true;
		}
		return false;
	}

	public boolean blackJack () {
		if(hand.getTotal() == 21) {
			return true;
		}
		return false;
	}
	
	
	//-----Getters Setters & toString

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Player name: ");
//		builder.append(name);
//		builder.append("\nHand: ");
//		builder.append(hand);
//		builder.append("\nWallet: $");
//		builder.append(wallet);
//		builder.append("\n");
//		return builder.toString();
//	}
	public boolean placeBet (Double bet) {
		//setting the bet
		if(bet <= getWallet()) {
			this.bet = bet;
			setWallet(getWallet()-bet);
			return true;
		}
		
		return false;
	}
	public double getBet() {
		return bet;
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

	public Double getWallet() {
		return wallet;
	}

	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}

}
