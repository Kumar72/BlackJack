package blackJack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
	int numDelt = 0;
	private List<Card> cards = new ArrayList<>(52);

	
	// making the deck!
	public void createDeck() {
		// Card assignValue = new Card();
		for (Suits s : Suits.values()) { // X4
			for (Ranks r : Ranks.values()) {
				cards.add(new Card(r, s));
			}
		}
	}

	public void shuffleDeck() {
		createDeck();
		Collections.shuffle(cards);
	}

	public Card dealCard() {
		shuffleDeck();
		Card card = cards.remove(0);
		return card;

	}

	public List<Card> cardsLeft() {
//		dealCard();
//		System.out.println(cards.size());
		return cards;
	}

}

//EDITS****