package invaders;

/**
 * See StatusBar.java for full explanation Holds shots taken by player
 * 
 * @author Brian
 * 
 */
public class Shots {
	private int shot;

	public Shots(int i) {
		shot = i;
	}

	public int getShot() {
		return shot;
	}

	public void setShot(int shot) {
		this.shot = shot;
	}

	public int incShot() {
		shot++;
		return shot;
	}

}
