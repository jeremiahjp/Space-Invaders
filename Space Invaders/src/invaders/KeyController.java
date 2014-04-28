package invaders;

import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

/**
 * Controls the keyboard
 * 
 * @author FRBD
 * 
 */
public class KeyController implements KeyListener, ActionListener {
	private static Timer t;
	private DInvadersModel model;
	private DInvadersView view;

	/**
	 * Constructor
	 * 
	 * @param model
	 *            the model of the game
	 * @param view
	 *            the view of the game
	 * @param statusBar
	 *            the status bar of the game
	 */
	public KeyController(DInvadersModel model, DInvadersView view) {
		setT(new Timer(10, this));
		this.model = model;
		this.view = view;
		view.addKeyListener(this);
	}

	@Override
	/**
	 * Handles events when the key is pressed
	 */
	public void keyPressed(KeyEvent arg0) {
		/*
		 * If the spacebar is pressed
		 */
		if (model.getMissile().getMy() == -1
				&& arg0.getKeyCode() == KeyEvent.VK_SPACE) {
			model.getMissile().fire();
			view.getStatusBar1().getShots().incShot();
			view.getStatusBar1().setStatus();
		}

		/*
		 * if the ESC key is pressed
		 */
		if (arg0.getKeyCode() == KeyEvent.VK_ESCAPE) {
			getT().stop();
			String s = (String) JOptionPane
					.showInputDialog("Are you sure you want to quit?:\n"
							+ "\"Yes or No\"");
			if ((s != null) && (s.length() > 0) && s.equalsIgnoreCase("yes")) {
				System.exit(0);
			}
			getT().start();
		}
		if (arg0.getKeyCode() == KeyEvent.VK_P) {
			model.setPause(!model.getPause());
			getT().stop();
			JOptionPane.showMessageDialog(view, "Game Is Paused");
			getT().start();
		}

		/*
		 * If the A key is pressed to move left
		 */
		if (DInvadersMouseController.isEnabledMouse() == false)
			if (arg0.getKeyCode() == KeyEvent.VK_A) {
				model.getDShip()
						.setVelocity(model.getDShip().getVelocity() - 1);
				if (model.getDShip().getVelocity() < -3)
					model.getDShip().setVelocity(-3);
			}
		/*
		 * If the D key is pressed to move right
		 */
		if (DInvadersMouseController.isEnabledMouse() == false)
			if (arg0.getKeyCode() == KeyEvent.VK_D) {
				model.getDShip()
						.setVelocity(model.getDShip().getVelocity() + 1);
				if (model.getDShip().getVelocity() > 3)
					model.getDShip().setVelocity(3);
			}
		/*
		 * If the S or W keys are pressed to stop the Ship
		 */
		if (DInvadersMouseController.isEnabledMouse() == false)
			if (arg0.getKeyCode() == KeyEvent.VK_S
					|| arg0.getKeyCode() == KeyEvent.VK_W) {
				model.getDShip().setVelocity(0);
			}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {

	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

	/**
	 * Invoked when an action occurs.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (DInvadersMouseController.isEnabledMouse() == true)
			model.getDShip().setVelocity(0);
		model.getDShip().setShipX(
				model.getDShip().getShipX() + model.getDShip().getVelocity());
		view.repaint();

	}

	/**
	 * get the timer
	 */
	public static Timer getT() {
		return t;
	}

	/**
	 * set the timer
	 */
	public static void setT(Timer t) {
		KeyController.t = t;
	}

}
