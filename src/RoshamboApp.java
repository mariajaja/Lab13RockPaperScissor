import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class RoshamboApp {

	/**
	 * This program creates a game of rock, paper, scissors for the user to play
	 * with selected opponents.
	 */

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Player userChoice = new UserRoshambo();
		Player opponentChoice = new GalacticEmpire();
		boolean isValid = false;
		Roshambo opponentPick;

		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.print("Enter your name: ");
		String userName = userInput.nextLine();
		// sets user's name
		userChoice.setUserName(userName);

		do {
			System.out.print(
					"Would you like to play against \"The Rebel Alliance\" or \"The Galactic Empire\"? (RA/GE): ");
			String opponentName = userInput.nextLine();

			// get user to make decision about move, and set user's move
			Roshambo userPick = userChoice.generateRoshambo();
			userChoice.setUserChoice(userPick);

			// get opponent's move after user choice's an opponent
			if (opponentName.toLowerCase().startsWith("ra")) {
				opponentChoice = new TheRebelAlliance();
				opponentChoice.setOpponentName("Rebel Alliance");
				opponentPick = opponentChoice.generateRoshambo();
				opponentChoice.setOpponentChoice(opponentPick);
			} else if (opponentName.toLowerCase().startsWith("ge")) {
				opponentChoice.setUserName("Galactic Empire");
				opponentPick = opponentChoice.generateRoshambo();
				opponentChoice.setOpponentChoice(opponentPick);
			} else {
				System.out.println("Yowza");
				// TODO make something through "Validator"
			}

			// TODO get "to string()" to work
			String finalResponse = getWinner(userChoice, opponentChoice, userName, opponentName);

			System.out.println(userChoice.getUserName() + ": " + userChoice.getUserChoice() + "\n"
					+ opponentChoice.getOpponentName() + ": " + opponentChoice.getOpponentChoice() + finalResponse);

			System.out.println();

			// check if user wants to play again
			System.out.print("Play again? (y/n): ");
			String userContinue = userInput.nextLine();
			isValid = userContinue.toLowerCase().startsWith("y");

		} while (isValid);

	}

	public static String getWinner(Player userChoice, Player opponentChoice, String userName, String opponentName) {
		String finalResponse = null;
		String r = new String();

		if (userChoice == opponentChoice) {
			finalResponse = "Draw!";
		} else if (userChoice.equals(Roshambo.ROCK)) {
			if (opponentChoice.equals(Roshambo.SCISSORS)) {
				finalResponse = userName + " wins!";
			} else if (opponentChoice.equals(Roshambo.PAPER)) {
				finalResponse = opponentName + " wins!";
			}
		} else if (userChoice.equals(Roshambo.SCISSORS)) {
			if (opponentChoice.equals(Roshambo.PAPER)) {
				finalResponse = userName + " wins!";
			} else if (opponentChoice.equals(Roshambo.ROCK)) {
				finalResponse = opponentName + " wins!";
			}
		} else if (userChoice.equals(Roshambo.PAPER)) {
			if (opponentChoice.equals(Roshambo.ROCK)) {
				finalResponse = userName + " wins!";
			} else if (opponentChoice.equals(Roshambo.SCISSORS)) {
				finalResponse = opponentName + " wins!";
			}
		}

		return finalResponse;
	}

}
