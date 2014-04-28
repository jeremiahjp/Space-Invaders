package invaders;

/**
 * The Model class for the game, will keep track of a variety of items that are
 * included in the game. Examples are the Player's Ship, Enemy Ships, and
 * Missiles.
 * 
 * @author FBRD
 * 
 */
public class DInvadersModel {

	/**
	 * The player's ship
	 */
	private DuckShip dShip;
	/**
	 * The enemy ships
	 */
	private EnemyShip eShip;
	/**
	 * The missile
	 */
	private Missile missile;
	/**
	 * The properties of the panel
	 */
	private int width, height;

	/**
	 * Properties of the game
	 */
	private int hits, misses;
	private boolean pause;

	/**
	 * Constructor of the class
	 */
	public DInvadersModel() {
		dShip = new DuckShip(384, 450, 50, 50);
		eShip = new EnemyShip(384, 150, 35, 25);
		missile = new Missile(this);
		width = 0;
		height = 0;
		hits = 0;
		misses = 0;
		pause = false;
	}

	/**
	 * Get the missile
	 * 
	 * @return the missile
	 */
	public Missile getMissile() {
		return missile;
	}

	/**
	 * Set the missile
	 * 
	 * @param missile
	 */
	public void setMissile(Missile missile) {
		this.missile = missile;
	}

	/**
	 * Set the Player's Ship
	 * 
	 * @param x
	 *            position in x coordinates
	 */
	public void setDShip(int x) {
		dShip.setShipX(x - dShip.getShipWidth() / 2);
	}

	/**
	 * Get the player's ship
	 * 
	 * @return the player's ship
	 */
	public DuckShip getDShip() {
		return dShip;
	}

	/**
	 * Get the enemy ships
	 * 
	 * @return enemy ships
	 */
	public EnemyShip getEShip() {
		return eShip;
	}

	/**
	 * Get the panel width
	 * 
	 * @return panel width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Get the panel height
	 * 
	 * @return panel height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Get the hits
	 * 
	 * @return hits
	 */
	public int getHits() {
		return hits;
	}

	/**
	 * Get the misses
	 * 
	 * @return misses
	 */
	public int getMisses() {
		return misses;
	}

	/**
	 * Get pause status
	 * 
	 * @return pause
	 */
	public boolean getPause() {
		return pause;
	}

	/**
	 * Set the size of the panel
	 * 
	 * @param width
	 *            the width of the panel
	 * @param length
	 *            the length of the panel
	 */
	public void setSize(int width, int length) {
		this.width = width;
		this.height = length;
	}

	/**
	 * Pauses the game
	 * 
	 * @param pause
	 *            boolean if it's pause or not
	 */
	public void setPause(boolean pause) {
		this.pause = pause;
	}
}
