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
		Player opponentChoiceGE = new GalacticEmpire();
		Player opponentChoiceRA = new TheRebelAlliance();

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

			// get opponent's move after user choice's an opponent
			// TODO
			if (opponentName.toLowerCase().startsWith("ra")) {
				opponentChoiceRA.setOpponentName("Rebel Alliance");
				opponentPick = opponentChoiceRA.generateRoshambo();
				opponentChoiceRA.setOpponentChoice(opponentPick);
			} else if (opponentName.toLowerCase().startsWith("ge")) {
				opponentChoiceGE.setUserName("Galactic Empire");
				opponentPick = opponentChoiceGE.generateRoshambo();
				opponentChoiceGE.setOpponentChoice(opponentPick);
			}

			// get user to make decision about move, and set user's move
			Roshambo userPick = userChoice.generateRoshambo();
			userChoice.setUserChoice(userPick);

			if (opponentName.toLowerCase().startsWith("ra")) {
				String finalResponse = getWinner(userChoice, opponentChoiceRA, userName, opponentName);
				System.out.println(userChoice.getUserName() + ": " + userChoice.getUserChoice() + "\n"
						+ opponentChoiceRA.getOpponentName() + ": " + opponentChoiceRA.getOpponentChoice()
						+ finalResponse);
			} else if (opponentName.toLowerCase().startsWith("ge")) {
				String finalResponse = getWinner(userChoice, opponentChoiceGE, userName, opponentName);
				System.out.println(userChoice.getUserName() + ": " + userChoice.getUserChoice() + "\n"
						+ opponentChoiceGE.getOpponentName() + ": " + opponentChoiceGE.getOpponentChoice()
						+ finalResponse);
			}

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
