package blackJack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	List<Card> hand = new ArrayList<>();
	Deck access = new Deck();
	
	
	public void addCard(Card card) {
		//Hit 		
	}
	
	public List<Card> getCardsInHand() {
				//this is a card returned from Deck!!! 
		hand.add(access.dealCard());
		hand.add(access.dealCard());
		
		return hand;
	}
	
	public int getValueOfHand() {
		
		//sum of the card! 
		return 0;
	}
	
}
