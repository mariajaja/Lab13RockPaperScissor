/**
 * 
 */

/**
 * @author Mariah
 *
 */
public enum Roshambo {

	ROCK {
		@Override
		public String toString() {
			return "rock";
		}
	},

	PAPER {
		@Override
		public String toString() {
			return "paper";
		}
	},

	SCISSORS {
		@Override
		public String toString() {
			return "scissors";
		}
	};

}
