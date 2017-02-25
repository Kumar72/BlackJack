package blackJack;

import java.util.Scanner;

public class Game {
	Player p = new Player("Aryan", 1000.0);
	Dealer d = new Dealer("Dealer", 1_000_000_000.0);
	

	Deck pDeck = new Deck();
	Hand hand = new Hand();
	
	int count;
	
	
	public void start () {
		Scanner input = new Scanner(System.in);
		pDeck.shuffleDeck();
		
		
		Deck p1 = new Deck();
		Deck d1 = new Deck();
		
		//fix this so that user can input the money here 
		p.setWallet(1000.00);
		
		while(p.getWallet() > 0) {
			
			System.out.println("You have $"+p.getWallet() +". \nHow much would you like to bet?");
			p.placeBet(input.nextDouble());
			
			if (p.getBet() > p.getWallet()) {
				System.out.println("Sorry, You don't have that much to bet!");
				break;
			}
			
			boolean endGame = false;

			
			p.setHand(hand);
			d.setHand(hand);
			d.setHand(hand);
			
			while(true) {
				System.out.println("Your Hand: \t");
				System.out.println(p.toString());
				System.out.println("Your hand total: " + p.getHand().getTotal());
				System.out.println("Dealer Hand: \t" + d1.dealCard().toString());
				
			}
			
		}

//		do {
//			if(p.placeBet(getBet()) < 25) {
//				
//			}
//			
//		}while(((Player)p).getBet() < 25);
//		
//		
		
		
		
		
//		Player p1 = new Player("Aryan", 500);
//		p1.getHand();
//		Player c1 = new Player("AI", 999_999);
//		c1.getHand();
//		System.out.println(p1 + "\n" +c1);
//	
//		count = 21;
//		if (count % 2 != 0) {
//			
			//deal card to player
			
//		}

		
		
	}

}
