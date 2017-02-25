package blackJack;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class MainMenu {
	//for user inputs
	Scanner input = new Scanner(System.in);

	// -----------------------METHODS---------------------------//

	
	// MAIN 
	public static void main(String[] args) {
		//Default
	
		
		MainMenu startUP = new MainMenu();
		startUP.mainMenu();

	}

	
	
	public void mainMenu() {

		DisplayMenu();

		//TESTS
	//	Deck printDeck = new Deck();
	//	printDeck.createDeck();
	//	printDeck.shuffleDeck();
	//	printDeck.cardsLeft();
	// 	printDeck.dealCard();
		 
	}

	public void DisplayMenu() {
		int pick;
		do {
			System.out.println("\n $$$$$$$$$$$$   WELCOME TO BLACKJACK (21)   $$$$$$$$$$$$");
			System.out.println("$\t\t\t\t\t\t\t$");
			System.out.println("$\t\t\t\t\t\t\t$");
			System.out.println("$\tSHOW STATUS HERE -- COMMING SOON\t\t$");
			System.out.println("$\t\t\t\t\t\t\t$");
			System.out.println("$\t\t\t\t\t\t\t$");
			System.out.println("$\t[1] Play BlackJack with Dealer.  \t\t$");
			System.out.println("$\t[2] Set up Game.\t\t\t\t$");
			System.out.println("$\t[3] Exit. \t\t\t\t\t$");
			System.out.println("$\t\t\t\t\t\t\t$");
			System.out.println("$\t\t\t\t\t\t\t$");
			System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			pick = input.nextInt();
			if (pick == 3)
				break;
			else
				switch (pick) {
				case 1:
					Game newGame = new Game();
					newGame.start();
					break;
				case 2:
					
					
					break;
				}

		} while (pick != 3);
		
	}

}
