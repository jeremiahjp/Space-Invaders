/**
 * Missile class holds properties of
 * a missile/weapon/rocket.
 * @author FireBreathingRubberDuckies
 */

package invaders;

import java.awt.Color;
import java.awt.Graphics;

public class Missile {
	private int mx, my, mdx, mdy;
	private DInvadersModel model;

	/**
	 * Constructor fot the Missile class
	 * 
	 * @param model
	 */
	public Missile(DInvadersModel model) {
		this.my = -1;
		this.mx = 1;
		this.model = model;
	}

	/**
	 * Draws the missile (line) which is set to a green color at coordinates
	 * (x1,y1) and (x2,y2).
	 * 
	 * @param g
	 */
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.drawLine(this.mx, my, mx, my + 3);
	}

	/**
	 * Get missile x value
	 * 
	 * @return
	 */
	public int getMx() {
		return mx;
	}

	/**
	 * Set missile's x value
	 * 
	 * @param mx
	 */
	public void setMx(int mx) {
		this.mx = mx;
	}

	/**
	 * Get missile's y value
	 * 
	 * @return
	 */
	public int getMy() {
		return my;
	}

	/**
	 * Set missile's y value
	 * 
	 * @param my
	 */
	public void setMy(int my) {
		this.my = my;
	}

	/**
	 * Get velocity of duck ship's position x
	 * 
	 * @return
	 */
	public int getMdx() {
		return mdx;
	}

	/**
	 * Set velocity of duck ship's position x
	 * 
	 * @param mdx
	 */
	public void setMdx(int mdx) {
		this.mdx = mdx;
	}

	/**
	 * Get velocity of duck ship's position y
	 * 
	 * @return
	 */
	public int getMdy() {
		return mdy;
	}

	/**
	 * Set velocity of duck ship's position y
	 * 
	 * @param mdy
	 */
	public void setMdy(int mdy) {
		this.mdy = mdy;
	}

	/**
	 * The fire method sets the mx (which is the missile's x value) to the
	 * center of the dship and the my (which is the missile's y value) to the
	 * height of the dship and mdx which is the velocity of the duck ship
	 */
	public void fire() {
		mx = (int) (model.getDShip().getShipX() + 24);
		my = (int) model.getDShip().getShipY();
		mdx = model.getDShip().getVelocity();
	}

	public void setupLauncher() {
		model.getMissile().setMy(model.getMissile().getMy() - 4);
		if (model.getMissile().getMy() <= -1) // This ensures the missile has
												// left the screen before firing
												// another missile
			model.getMissile().setMy(-1); // Sets the missile to default after
											// it leaves the screen: default -1
		model.getMissile().setMx(
				model.getMissile().getMx() + model.getMissile().getMdx());
	}
}
