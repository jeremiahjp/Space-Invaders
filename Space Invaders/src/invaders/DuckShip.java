package invaders;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * This class is the Player's Ship, keeps track of its positions and velocity
 * 
 * @author FBRD
 * 
 */
public class DuckShip {
	private double shipX;
	private double shipY;
	private int shipWidth;
	private int shipHeight;
	private int velocity;

	/**
	 * Constructor
	 * 
	 * @param x
	 *            position in x
	 * @param y
	 *            posiiton in y
	 * @param width
	 *            width of the ship
	 * @param height
	 *            height of the ship
	 */
	public DuckShip(double x, double y, int width, int height) {
		this.velocity = 0;
		shipX = x;
		shipY = y;
		shipWidth = width;
		shipHeight = height;
	}

	/**
	 * Get the ship's x position
	 */
	public double getShipX() {
		if (shipX < -20)
			return 765;
		if (shipX > 765)
			return -20;
		return shipX;
	}

	/**
	 * Get the ship's y position
	 */
	public double getShipY() {
		return shipY;
	}

	/**
	 * get the ship's width
	 */
	public int getShipWidth() {
		return shipWidth;
	}

	/**
	 * Get the ship's height
	 */
	public int getShipHeight() {
		return shipHeight;
	}

	/**
	 * set the ship's x position
	 */
	public void setShipX(double x) {
		this.shipX = x;
	}

	/**
	 * set the ship's y position
	 */
	public void setShipY(double y) {
		this.shipY = y;
	}

	/**
	 * set the ship's width
	 * 
	 * @param x
	 */
	public void setShipWidth(int x) {
		this.shipWidth = x;
	}

	/**
	 * set the ship's height
	 * 
	 * @param y
	 */
	public void setShipHeight(int y) {
		this.shipHeight = y;
	}

	/**
	 * get the ship's velocity
	 */
	public int getVelocity() {
		return velocity;
	}

	/**
	 * set the ship's velocity
	 * 
	 * @param velocity
	 */
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

}
