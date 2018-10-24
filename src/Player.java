/**
 * 
 */

/**
 * @author Mariah
 *
 */
public abstract class Player {
	private String userName;
	private Roshambo userChoice;
	private String opponentName;
	private Roshambo opponentChoice;

	public Player() {

	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Roshambo getUserChoice() {
		return this.userChoice;
	}

	public void setUserChoice(Roshambo userChoice) {
		this.userChoice = userChoice;
	}

	public String getOpponentName() {
		return opponentName;
	}

	public void setOpponentName(String opponentName) {
		this.opponentName = opponentName;
	}

	public Roshambo getOpponentChoice() {
		return opponentChoice;
	}

	public void setOpponentChoice(Roshambo opponentChoice) {
		this.opponentChoice = opponentChoice;
	}

	public abstract Roshambo generateRoshambo();

}
