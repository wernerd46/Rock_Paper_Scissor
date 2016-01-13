import java.util.Scanner;
import java.util.Random;


public class RPG_Game {

	
	public static void main(String[] args) {
	
		String personPlay;
		String computerPlay = "";
		int computerInt;
		
		String response;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.println("Lets play Rock, Paper, Scissors!");
		System.out.println("Pick R for Rock, P for Paper, S for Scissors.");
		
		System.out.println();
		
		computerInt = generator.nextInt(3)+1;
		
		if (computerInt == 1)
			computerPlay = "R";
		else if (computerInt == 2)
			computerPlay = "P";
		else if (computerInt == 3)
			computerPlay = "S";
		
		System.out.println("Enter your play: ");
		personPlay = scan.next();
		
		personPlay = personPlay.toUpperCase();
		
		System.out.println("Computers play is: " + computerPlay);
		
		if (personPlay.equals(computerPlay)){
			System.out.println("Its a tie!");
		}
		else if (personPlay.equals("R")){
			if(computerPlay.equals("S"))
				System.out.println("Rock crushes Scissors! You Win!!");
			else if (computerPlay.equals("P"))
				System.out.println("Paper smothers rock! You Lose!");
		}
		
			else if (personPlay.equals("P")){
				if (computerPlay.equals("S"))
					System.out.println("Scissors cuts paper! You Lose!");
				else if (computerPlay.equals("R"))
						System.out.println("Paper smothers rock! You Win!");
			}
				else if (personPlay.equals("S")){
					if (computerPlay.equals("P"))
						System.out.println("Scissors cuts paper! You Win!");
					else if (computerPlay.equals("R"))
						System.out.println("Rock crushes scissors! You Lose!");
				}
					else 
						System.out.println("Invalid user input");
				
		
		
		
				

	}

}
