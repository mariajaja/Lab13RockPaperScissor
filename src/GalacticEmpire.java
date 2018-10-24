/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class GalacticEmpire extends Player {
//	private String opponentName;
//	private Roshambo opponentChoice;

	public GalacticEmpire() {
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
		return Roshambo.ROCK;
	}

}
