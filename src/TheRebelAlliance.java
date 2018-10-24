/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class TheRebelAlliance extends Player {
//	private String opponentName;
//	private Roshambo opponentChoice;

	public TheRebelAlliance() {

	}

//	public String getOpponentName() {
//		return opponentName;
//	}
//
//	public void setOpponentName(String opponentName) {
//		this.opponentName = opponentName;
//	}
//
//	public Roshambo getOpponentChoice() {
//		return opponentChoice;
//	}
//
//	public void setOpponentChoice(Roshambo opponentChoice) {
//		this.opponentChoice = opponentChoice;
//	}

	@Override
	public Roshambo generateRoshambo() {
		int choice = (int) (Math.random() * 3) + 1;
		Roshambo random = null;

		if (choice == 1) {
			random = Roshambo.ROCK;
		} else if (choice == 2) {
			random = Roshambo.PAPER;
		} else if (choice == 3) {
			random = Roshambo.SCISSORS;
		}
		return random;
	}

}
