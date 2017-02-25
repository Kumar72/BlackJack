package blackJack;

public class Card {

	//enums and values 
	private Ranks rank;
	private Suits suit;
	private int faceValue;

	// ctor
	public Card(Ranks r, Suits s) {
		rank = r;
		suit = s;
		
		switch (r) {
		case TEN:
		case JACK:
		case QUEEN:
		case KING:
			faceValue = 10;
			break;
		case ACE:
			faceValue = 11;
			break;
		case TWO:  
			faceValue = 2; break;
		case THREE:  
			faceValue = 3; break;
		case FOUR:  
			faceValue = 4; break;
		case FIVE:  
			faceValue = 5; break;
		case SIX:  
			faceValue = 6; break;
		case SEVEN:  
			faceValue = 7; break;
		case EIGHT:  
			faceValue = 8; break;
		case NINE:  
			faceValue = 9; break;
		}
		
	}
	
	//An Ace 
	public boolean anAce () {
		return getRank() == rank.ACE;
	}

	
	//getters
	public Ranks getRank() {
		return rank;
	}

	public Suits getSuit() {
		return suit;
	}

	public int getValue() {
		return faceValue;
	}

	//setter
	public void setValue(int value) {
		faceValue = value;
	}

	// toString to print all the cards
	public String toString() {
		return (rank /*+"(" + faceValue +") " */+ " of " + suit).toLowerCase();
	}

	// make hashCodes for all the cards
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	// ?? just a built in equals test --- IGNORE for NOW
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (suit != other.suit)
			return false;
		if (rank != other.rank)
			return false;
		return true;
	}
	// I think this one is done!!
	// IT makes all the cards and gives them there own unique hashCodes()

}
