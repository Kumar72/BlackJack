package blackJack;

import java.util.Scanner;

public class PlayerSetUp {

	protected void setUp() {
		Scanner input = new Scanner(System.in);
		int pick;
		MainMenu backToMenu = new MainMenu();
		Player p1 = new Player();
		Player dealer = new Player();
		outer: do {
			System.out.println(" _______________________________________________________________________");
			System.out.println("|\t\t\t\t\t\t\t\t\t|");
			System.out.println("|\t\t-----BLACK JACK PLAYER SETUP------\t\t|");
			System.out.println("|\t\t\t\t\t\t\t\t\t|");
			System.out.println("|\t\t\t\t\t\t\t\t\t|");
			System.out.println("|\t\t\t\t\t\t\t\t\t|");
			System.out.println("|\tWhat would you like to change(1-5)?\t\t\t\t|");
			System.out.println("|\t\t\t\t\t\t\t\t\t|");
			System.out.println("|\t0. Return to Menu\t\t\t\t\t\t|");
			System.out.println("|\t1. Player Name\t\t\t\t\t\t\t|");
			System.out.println("|\t2. \t\t\t\t\t\t\t|");
			System.out.println("|\t3. Difficulty\t\t\t\t\t\t\t|");
			System.out.println("|\t4. Credits\t\t\t\t\t\t\t|");
			System.out.println("|\t5. Reset\t\t\t\t\t\t\t|");
			System.out.println("|\t\t\t\t\t\t\t\t\t\t\t|");
			System.out.println(" _______________________________________________________________________");
			pick = input.nextInt();

			switch (pick) {

			case 1:
				System.out.print("What would you like to be called? \t");
				p1.setName(input.next());
				break;
			case 2:
				
				
			case 3:
				System.out.println("What difficulty would you like(1-3)?");
				System.out.println("1. Begineer");
				System.out.println("2. Normal");
				System.out.println("3. Programmer");
				pick = input.nextInt();
				if (pick == 1)
					
				if (pick == 2)
					
				if (pick == 3)
					
				break;
			case 4:
				System.out.println("Designer: Chandan Thakur \n");
				System.out.println("Would you like to go back to the menu?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				pick = input.nextInt();
				if (pick == 1)
					continue outer;
			case 5:
				backToMenu.DisplayMenu();(p1);
				break;
			}
		} while (pick != 0);
		backToMenu.DisplayMenu(p1);
		//I am printing the screen here in this method! 
		// input.close();
	}
}
