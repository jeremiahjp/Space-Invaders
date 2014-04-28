package invaders;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * The Main Panel for the game
 * 
 * @author FRBD
 * 
 */
public class MainPanel extends JPanel {
	private DInvadersModel model;
	private int count = 300;
	private CollisionDetection collisionDetection;
	private DInvadersView view;

	/**
	 * Constructor
	 * 
	 * @param model
	 *            the model of the game
	 * @param view
	 *            the view of the game
	 */
	public MainPanel(DInvadersModel model, DInvadersView view) {
		this.view = view;
		this.model = model;
		collisionDetection = new CollisionDetection(view, model);
	}

	@Override
	/**
	 * Paints the components of the game
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		int x = (int) model.getDShip().getShipX();
		int y = (int) model.getDShip().getShipY();
		int width = model.getDShip().getShipWidth();
		int height = model.getDShip().getShipHeight();
		String shipName = "Galagaship.png";
		String bkgd = "Spacebackground.png";
		ImageIcon background = new ImageIcon(bkgd);
		ImageIcon galagaShip = new ImageIcon(shipName);
		Image backgroundImage = background.getImage();
		Image ship = galagaShip.getImage();
		g.drawImage(backgroundImage, 0, 0, Color.black, this);
		g.drawImage(ship, x, y, width, height, Color.BLACK, this);

		/* This draws the enemy ship */
		for (int i = 0; i <= 14; i++) {
			if (EnemyShip.getEnemies()[i] != null)
				EnemyShip.getEnemies()[i].draw(g);
		}
		// increment count every time
		count++;
		// if count is greater than 300 move to the left
		// if (count > 300) {
		// count = 0;
		// This makes the enemies move to the left
		for (int h = 0; h < 15; h++) {
			if (EnemyShip.getEnemies()[h] != null)
				EnemyShip.getEnemies()[h].moveLeft();
		}
		// }
		// when count is equal to 150 move to the right
		// else if (count == 150) {
		for (int h = 0; h < 15; h++) {
			if (EnemyShip.getEnemies()[h] != null)
				EnemyShip.getEnemies()[h].moveRight();

		}
		// }

		if (model.getMissile().getMy() != -1) { /*
												 * add the code to draw the
												 * missile
												 */
			model.getMissile().setupLauncher(); /* setup the missile launcher */
			model.getMissile().draw(g); /* This draws the missile */
		}

		/* Calls the function to determine if collision occurred */
		collisionDetection.detectCollision();

	}
}