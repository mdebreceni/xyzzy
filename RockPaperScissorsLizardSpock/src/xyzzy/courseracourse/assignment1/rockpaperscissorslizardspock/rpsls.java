package xyzzy.courseracourse.assignment1.rockpaperscissorslizardspock;
import java.util.Random;

class rpsls implements RpslsMoves {

	public int makeComputerMove()
	{
		Random rand = new Random();
		int move = rand.nextInt(5);
		return move;
	}

	public void showResult(String gameOutcome) {
		// display a popup containing game outcome in string form

	}

	public void playRock() {
		showResult(playRound(MOVE_ROCK, makeComputerMove()));
	}

	public void playPaper() {
		showResult(playRound(MOVE_PAPER, makeComputerMove()));

	}

	public void playScissors() {
		showResult(playRound(MOVE_PAPER, makeComputerMove()));

	}

	public void playLizard() {
		showResult(playRound(MOVE_LIZARD, makeComputerMove()));

	}

	public void playSpock() {
		showResult(playRound(MOVE_SPOCK, makeComputerMove()));
	}

	public String playRound(int playerMove, int computerMove) 
	{
		String outcome = "TODO";
		// play a game of rock paper scissors lizard spock 
		int difference = (computerMove - playerMove) % 5;
		
		if (difference == 0) {
			// tie
		} else if(difference > 2) {
			// player wins
		} else {
			// computer wins

		}

		return outcome;
	}
}
