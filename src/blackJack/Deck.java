package blackJack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck { 
	int numDelt = 0;
	private List<Card> deck = new ArrayList<>(52);

	//making the deck! 
	public void createDeck() {
		//Card assignValue = new Card();
		//double for loop - to make the deck! 
		//at the end add all the cards to the List<Card> deck!! == DECK
		for (Suits s : Suits.values()) {		//X4
			for (Ranks r : Ranks.values()) {
				//assignValue.assignValueToCard(r);//X13
				deck.add(new Card(r, s));
			}
		}
		//Test - assign values to the cards!! 
		//for (Card card : deck) {
//			System.out.println(card);

			//}
		}

	public void shuffleDeck() {
		createDeck();
		Collections.shuffle(deck);
		//Test
//		System.out.println(deck.size());
		//for (Card card: deck) {
		//can't print out the card! 
		//System.out.println(deck);
		//}
	}
	
	public Card dealCard() {
		//stores the shuffled Deck of cards! 
		shuffleDeck();
		//this.deck.get(0);
		//this.deck.remove(0);
		//numDelt--;
		//System.out.println(deck.get(0));
		return deck.remove(0);
		
	}

	public void cardsLeft() {
		dealCard();
		System.out.println(deck.size());
	}

}