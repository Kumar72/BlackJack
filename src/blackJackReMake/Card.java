package blackJackReMake;

public class Card {
	private Suits suit;
	private Values value;
	
	public Card(Suits s, Values v) {
		suit = s;
		value = v;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(value);
		builder.append(" of ");
		builder.append(suit);
		builder.append("\n");
		return builder.toString();
	}

	public Values getValue() {
		return value;
	}

	public void setValue(Values value) {
		this.value = value;
	}
	
	
}
