package blackJackReMake;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
		
	private ArrayList<Card> cards;
	
	public Deck() {
		this.cards = new ArrayList<Card>(52);
	}
	
	public void createFullDeck() {
		//Generate cards here
		for(Suits s: Suits.values()) {
			for(Values v: Values.values()) {
				
				this.cards.add(new Card(s,v));
			}
		}
	}
	
	public void shuffle() {
		ArrayList<Card> tempDeck = new ArrayList<Card>();
		//use random 
		Random r = new Random();
		int randomCardIndex = 0;
		int originalSize = this.cards.size();
		for (int i = 0; i < originalSize; i++) {
			randomCardIndex = r.nextInt((this.cards.size()-1) +1) +0;
			tempDeck.add(this.cards.get(randomCardIndex));
			this.cards.remove(randomCardIndex);
		}
		this.cards = tempDeck;
		
	}
	
	public void removeCard (int i) {
		this.cards.remove(i);
	}
	
	public Card getCard (int i) {
		return this.cards.get(i);

	}
	
	public void addCard(Card addCard) {
		this.cards.add(addCard);
	}
	
	public void draw(Deck comingFrom) {
		this.cards.add(comingFrom.getCard(0));
		comingFrom.removeCard(0);
		
	}
	
	public int cardsValue () {
		int totalValue = 0;
		int aces = 0;
		
		for (Card c: this.cards) {
			switch(c.getValue()) {
			case TWO: totalValue +=2; break;
			case THREE: totalValue +=3; break;
			case FOUR: totalValue +=4; break;
			case FIVE: totalValue +=5; break;
			case SIX: totalValue +=6; break;
			case SEVEN: totalValue +=7; break;
			case EIGHT: totalValue +=8; break;
			case NINE: totalValue +=9; break;
			case TEN: 
			case JACK:
			case QUEEN:
			case KING: totalValue +=10; break;
			case ACE:totalValue +=1; break;
			}
		}
		for(int i = 0; i < aces; i++) {
			if (totalValue > 10) {
				totalValue+=1;
			}
			else totalValue += 11;
		}
		return totalValue;
	}
	
	public int deckSize() {
		return this.cards.size();
	}
	
	public void moveAllToDeck (Deck moveTo) {
		int deckSize = this.cards.size();
		for (int i = 0; i < deckSize; i++) {
			moveTo.addCard(this.getCard(i));
			
		}
		for (int i = 0; i < deckSize; i++) {
			this.removeCard(0);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("");
		builder.append(cards);
		builder.append("");
		return builder.toString();
	}
	
	
	
}
