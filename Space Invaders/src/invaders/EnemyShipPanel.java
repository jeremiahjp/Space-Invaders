/**
 * EnemyShipPanel moves enemies right to left
 * and up and down.  This panel also draws the enemy.
 */

package invaders;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EnemyShipPanel extends JPanel implements ActionListener {
	private int size, x, y, dx, dy, bx, by, dbx, dby, numBombs;
	private Random gen;
	private Image im;

	/**
	 * Constructor
	 * 
	 * @param x1
	 * @param y1
	 * @param f
	 */
	public EnemyShipPanel(int x1, int y1, String f) {
		size = 25;
		dx = 0;
		dy = 0;
		bx = -1;
		by = -1;
		dbx = 2;
		dby = 2;
		x = x1;
		y = y1;
		numBombs = 5;
		ImageIcon ii = new ImageIcon(f);
		im = ii.getImage();
	}

	/**
	 * Moves enemies to the left
	 */
	public void moveLeft() {
		dx = -1;
		if (x <= -20)
			x = 850;
	}

	/**
	 * Moves enemies to the right
	 */
	public void moveRight() {
		dx = 1;
		if (x >= 850)
			x = -20;
	}

	/**
	 * Moves enemies down
	 */
	public void moveDown() {

		y = y + 1;

	}

	/**
	 * Moves enemies up
	 */
	public void moveUp() {

	}

	/**
	 * Draw the enemy
	 * 
	 * @param gr
	 */
	public void draw(Graphics gr) {
		x += dx;
		gr.drawImage(im, x, y, size, size, Color.black, this);
	}

	/**
	 * Get enemy ship's x position
	 */
	public int getX() {
		return x;
	}

	/**
	 * Get enemy ship's y position
	 */
	public int getY() {
		return y;
	}

	public int getBX() {
		return bx;
	}

	public int getBY() {
		return by;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}