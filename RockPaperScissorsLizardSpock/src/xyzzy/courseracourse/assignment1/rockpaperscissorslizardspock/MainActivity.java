package xyzzy.courseracourse.assignment1.rockpaperscissorslizardspock;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.content.res.*;

public class MainActivity extends Activity {
    rpsls rpslsGame;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void playRock(View view) {
		Log.d("rpsls", "playRock: view height is " + view.getHeight());
		
		Log.d("rpsls", "playRock()");
		
		String s;
		s = playRound(rpsls.MOVE_ROCK, makeComputerMove());
		Log.d("rpsls", "playRock() returning.  s = " + s);
	
	}

	public void playPaper(View view) {
		
		showResult(playRound(rpsls.MOVE_PAPER, makeComputerMove()));

	}

	public void playScissors(View view) {
		showResult(playRound(rpsls.MOVE_SCISSORS, makeComputerMove()));

	}
	
	public void playLizard(View view) {
		showResult(playRound(rpsls.MOVE_LIZARD, makeComputerMove()));
	}

	public void playSpock(View view) {
		showResult(playRound(rpsls.MOVE_SPOCK, makeComputerMove()));
	}

	public int makeComputerMove()
	{
		Log.d("rpsls", "makeComputerMove");
		Random rand = new Random();
		int move = rand.nextInt(5);
		Log.d("rpsls", "makeComputerMove() returning");
		return move;
	}

	public void showResult(String gameOutcome) {
		// display a popup containing game outcome in string form
		Log.d("rpsls", gameOutcome);
	}

	public String playRound(int playerMove, int computerMove) 
	{
		Resources res = getResources();
		
		String outcome = "TODO";
		// play a game of rock paper scissors lizard spock 
		int difference = (computerMove - playerMove) % 5;
		Log.d("rpsls","playRound("+playerMove+","+computerMove+")");
		outcome = res.getString(R.string.you_played) + res.getStringArray(R.array.moves)[playerMove];
		outcome += res.getString(R.string.and_i_played) + res.getStringArray(R.array.moves)[computerMove];
		if (difference == 0) {
			outcome += res.getString(R.string.tie);
			
			// tie
		} else if(difference > 2) {
			outcome += res.getString(R.string.you_win);
			// player wins
		} else {
			outcome += res.getString(R.string.i_win);
			// computer wins
	
		}

		Log.d("rpsls", outcome);
		return outcome;
	}


}
