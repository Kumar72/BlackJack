package blackJackReMake;

import java.util.Scanner;

public class BlackJack {
	public static void main(String[] args) {
		System.out.println("WELCOME\n");
		Deck pDeck = new Deck();
		pDeck.createFullDeck();
		pDeck.shuffle();
		// System.out.println(pDeck);

		Deck player = new Deck();
		Deck dealer = new Deck();

		double playerMoney = 1000.00;

		Scanner input = new Scanner(System.in);

		// Game Loop
		while (playerMoney > 0) {
			System.out.println("You have $" + playerMoney + ", How much would you like to bet?");
			double playerBet = input.nextDouble();
			if (playerBet > playerMoney) {
				System.out.println("You cannot bet more than you have! Please Leave!!");
				break;
			}

			boolean endRound = false;
			player.draw(pDeck);
			dealer.draw(pDeck);
			player.draw(pDeck);
			dealer.draw(pDeck);

			while (true) {
				System.out.println("Your hand: ");
				System.out.println(player.toString());
				System.out.println("Your hand is valued at: " + player.cardsValue());

				System.out.println("Dealer Hand: " + dealer.getCard(0).toString() + "and [Hidden]");

				System.out.println("Would you like to [1] Hit  or [2] Stay");
				int response = input.nextInt();
				if (response == 1) {
					player.draw(pDeck);
					System.out.println("You drew a: " + player.getCard(player.deckSize() - 1).toString());
					if (player.cardsValue() > 21) {
						System.out.println("BUST. Currently valued at " + player.cardsValue());
						playerMoney -= playerBet;

						endRound = true;
						break;
					}
				}
				if (response == 2) {
					break;
				}

			}

			System.out.println("Dealer Card: " + dealer.toString());
			if (dealer.cardsValue() > player.cardsValue() && endRound == false) {
				System.out.println("Dealer WINS!!!");
				playerMoney -= playerBet;
				endRound = true;
			}
			while (dealer.cardsValue() < 17 && endRound == false) {
				dealer.draw(pDeck);
				System.out.println("Dealer Draws: " + dealer.getCard(dealer.deckSize() - 1).toString());

			}
			System.out.println("Dealer hand value: " + dealer.cardsValue());
			if (dealer.cardsValue() > 21 && endRound == false) {
				playerMoney += playerBet;
				endRound = true;
			}
			if (player.cardsValue() == dealer.cardsValue() && endRound == false) {
				System.out.println("PUSH");
				endRound = true;
			}
			if (player.cardsValue() > dealer.cardsValue() && endRound == false) {
				playerMoney += playerBet;
				System.out.println("You Win!!");
				endRound = true;
			}
			else if (endRound == false) {
				System.out.println("You Lose the Hand!!");
				playerMoney -=playerBet;
			}
			player.moveAllToDeck(pDeck);
			dealer.moveAllToDeck(pDeck);
			System.out.println("END of HAND.");
		}
		System.out.println("GAME OVER!!");
	}

}
