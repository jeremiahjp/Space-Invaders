package invaders;

/**
 * See StatusBar.java for full explanation Holds the hits the player makes
 * 
 * @author Brian
 * 
 */
public class Hits {
	private int hit;

	/**
	 * Constructor
	 * 
	 * @param i
	 */
	public Hits(int i) {
		hit = i;
	}

	/**
	 * get the hits
	 */
	public int getHit() {
		return hit;
	}

	/**
	 * set the hits
	 * 
	 * @param hit
	 */
	public void setHit(int hit) {
		this.hit = hit;
	}

	public int incHit() {
		hit++;
		return hit;
	}

}
