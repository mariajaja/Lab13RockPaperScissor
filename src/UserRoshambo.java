import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class UserRoshambo extends Player {

	private Scanner userInput;

	public UserRoshambo() {
	}

	public void ConsoleChoice(Scanner scanner) {
		this.userInput = scanner;
	}

	@Override
	public Roshambo generateRoshambo() {
		Roshambo choice = Roshambo.ROCK;
		// program won't use values within the if-else. not sure why
		System.out.print("Rock, paper, or scissors? (R/P/S): ");
		String userResponse = userInput.nextLine();

		if (userResponse.toLowerCase().startsWith("r")) {
			choice = Roshambo.ROCK;
		} else if (userResponse.toLowerCase().startsWith("p")) {
			choice = Roshambo.PAPER;
		} else if (userResponse.toLowerCase().startsWith("s")) {
			choice = Roshambo.SCISSORS;
		}

		return choice;
	}

}
