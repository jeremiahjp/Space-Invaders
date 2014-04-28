package invaders;

/**
 * See StatusBar.java for full explanation Holds the Score the player gets
 * 
 * @author Brian
 * 
 */
public class Score {
	private int score;

	public Score(int i) {
		score = i;
	}

	public int incScore() {
		return score += 50;
	}

	public int getScore() {
		return score;
	}

}
