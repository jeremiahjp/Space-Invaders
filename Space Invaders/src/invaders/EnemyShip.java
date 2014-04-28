/**
 * EnemyShip class creates the enemies and 
 * places a particular enemy in an (x,y) position.
 */

package invaders;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;

//This will have the properties of the enemy ships
public class EnemyShip {
	static int bx = -1;
	static int by = -1;
	static int enemy1x, enemy1y, enemy2x, enemy2y, enemy3x, enemy3y, enemy4x,
			enemy4y, enemy5x, enemy5y, enemy6x, enemy6y, enemy7x, enemy7y,
			enemy8x, enemy8y, enemy9x, enemy9y, enemy10x, enemy10y, enemy11x,
			enemy11y, enemy12x, enemy12y, enemy13x, enemy13y, enemy14x,
			enemy14y, enemy15x, enemy15y;
	private Timer t;
	private int x, y, dx; // the launcher itself.
	private int mx, my, mdx, mdy; // add missile variables here

	private static EnemyShipPanel[] enemies;
	int count = 300;

	/**
	 * Constructor which creates an array enemy army (3 rows and 5 columns)
	 * 
	 * @param x
	 *            position
	 * @param y
	 *            position
	 * @param width
	 *            of enemy ship
	 * @param height
	 *            of enemy ship
	 */
	public EnemyShip(double x, double y, int width, int height) {
		t = new Timer(10, null);
		this.x = 100;
		this.y = 342;
		dx = 0;
		my = -1;
		setEnemies(new EnemyShipPanel[15]);
		getEnemies()[0] = new EnemyShipPanel(200, 50, "Redgalaga.png");
		getEnemies()[1] = new EnemyShipPanel(300, 50, "Bluegalaxian.png");
		getEnemies()[2] = new EnemyShipPanel(400, 50, "Galagancommander.png");
		getEnemies()[3] = new EnemyShipPanel(500, 50, "purplegalaxian.png");
		getEnemies()[4] = new EnemyShipPanel(600, 50, "yellowgalaga.png");
		getEnemies()[5] = new EnemyShipPanel(200, 85, "bluegalaxian.png");
		getEnemies()[6] = new EnemyShipPanel(300, 85, "galagancommander.png");
		getEnemies()[7] = new EnemyShipPanel(400, 85, "redgalaga.png");
		getEnemies()[8] = new EnemyShipPanel(500, 85, "yellowgalaga.png");
		getEnemies()[9] = new EnemyShipPanel(600, 85, "purplegalaxian.png");
		getEnemies()[10] = new EnemyShipPanel(200, 120, "Redgalaga.png");
		getEnemies()[11] = new EnemyShipPanel(300, 120, "Bluegalaxian.png");
		getEnemies()[12] = new EnemyShipPanel(400, 120, "yellowgalaga.png");
		getEnemies()[13] = new EnemyShipPanel(500, 120, "purplegalaxian.png");
		getEnemies()[14] = new EnemyShipPanel(600, 120, "redgalaga.png");
		t.start();
	}

	/**
	 * Create array of enemies
	 * 
	 * @return
	 */
	public static EnemyShipPanel[] getEnemies() {
		return enemies;
	}

	public static void setEnemies(EnemyShipPanel[] enemies) {
		EnemyShip.enemies = enemies;
	}

	/**
	 * Get enemy ship's y position
	 */
	public int getY() {
		return y;
	}

	/**
	 * Set enemy ship's y position
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Get enemy ship's x position
	 * 
	 * @return
	 */
	public int getX() {
		return x;
	}

}
