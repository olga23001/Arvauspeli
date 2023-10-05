import java.util.Scanner;

public class arvauspeli_main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String name;
		int counter = 0;
		int guesses = 0;
		String stop = "stop";
		String nothing = "";
		
		while (counter < 5)
		{System.out.println("Guess my name! (type stop to exit)");
		name = in.nextLine();
		counter++;
		
		if (name.equals("Noora"))
		{
		System.out.println("Congratulations!");
		guesses = guesses + 1;
		
		if (name.equals("Noora"))
		System.out.println("You guessed " + guesses + " times.");
		guesses = guesses + 1;
		break;
		}	
		if (name.equals("stop"))
		{
			System.out.println("You guessed " + guesses + " times.");
			guesses = guesses + 1;
			break;
		}
		
	
		else
		{
		System.out.print(nothing);
		guesses = guesses + 1;
		}
		
	
		
		}
		}}
	

