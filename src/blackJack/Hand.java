package blackJack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	List<Card> hand = new ArrayList<>();
	Deck access = new Deck();
	
	
	public void addCard(List<Card> cards) {
		hand = cards;
		//Hit 		
	}
	
	
	public List<Card> getCardsInHand() {
				//this is a card returned from Deck!!!
		return hand;
	}
	
	public Integer getTotal() {
		Integer t = 0;
		for(Card card: hand) {
			t += card.getValue();
		}
		
		return t;
	}
	
//	public int getValueOfHand() {
//		
//		//sum of the card! 
//		return 0;
//	}
	
	public int compareHand(Hand otherHand) {
		return this.getTotal().compareTo(otherHand.getTotal());
	}
	
}
