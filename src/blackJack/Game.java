package blackJack;

public class Game {
	Hand deal = new Hand();
	Deck printDeck = new Deck();
	Hand hand = new Hand();
	
	int count;
	
	public void start () {
		
		Player p1 = new Player("Aryan", 500);
		p1.getHand();
		Player c1 = new Player("AI", 999_999);
		c1.getHand();
		System.out.println(p1 + "\n" +c1);
	
		count = 21;
		if (count % 2 != 0) {
			
			//deal card to player
			
		}
		
	}
	
	
	
	
}
