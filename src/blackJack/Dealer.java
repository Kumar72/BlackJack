package blackJack;

public class Dealer {

	Hand hand = new Hand();
	//fields
	private String name;
	private Double wallet;

	
	//ctor
	public Dealer(String name, Double wallet) {
		this.name = name;
		//this.hand = hand;  		//needs to be random
		this.wallet = wallet;
	}
	
	public Dealer() {
		
	}
	
	
	//---------------------------METHODS----------------------//
	
	public String dealerAction() {
		String dealerAction = "";
		if(mustHit()) {
			dealerAction = "HIT";
		}
		else if (mustStand()) {
			dealerAction = "STAND";
		}
		return dealerAction;
	}
	
	public boolean mustHit() {
		if (getHand().getTotal() < 17) {
			return true;
		}
		return false;
	}
	
	public boolean mustStand () {
		if (getHand().getTotal() >= 17 && getHand().getTotal() < 22) {
			return true;
		}
		return false;
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