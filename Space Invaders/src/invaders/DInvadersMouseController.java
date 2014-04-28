package invaders;

import java.awt.event.*;

/**
 * This is the mouse event handler for the Panel.
 * 
 * @author FBRD
 * 
 */
public class DInvadersMouseController implements MouseListener,
		MouseMotionListener {
	private DInvadersModel model;
	private DInvadersView view;
	private static boolean enabledMouse;

	/**
	 * Constructor for the class
	 * 
	 * @param model
	 *            the model of this game
	 * @param view
	 *            the view of this game
	 */
	public DInvadersMouseController(DInvadersModel model, DInvadersView view) {
		DInvadersMouseController.enabledMouse = false;
		this.model = model;
		this.view = view;
		view.addMouseListener(this);
	}

	/**
	 * Go back to view for possible popup menu.
	 */
	public void mouseClicked(MouseEvent event) {
		/*
		 * When button 1 is clicked
		 */
		if (enabledMouse == true) {
			if (model.getMissile().getMy() == -1
					&& event.getButton() == MouseEvent.BUTTON1) {
				model.getMissile().fire();
				view.getStatusBar1().getScore().incScore();
				view.getStatusBar1().setStatus();
			}
		}
		view.checkForTriggerEvent(event);
	}

	/**
	 * Go back to view for possible popup menu.
	 */
	public void mousePressed(MouseEvent event) {
		view.checkForTriggerEvent(event);
	}

	/**
	 * nothing to do for mouse release
	 */
	public void mouseReleased(MouseEvent event) {

	}

	/**
	 * clear status bar
	 */
	public void mouseEntered(MouseEvent event) {

		if (enabledMouse == true) {
			model.setDShip(event.getX());
			view.getStatusBar1().setStatus();
		}
	}

	/**
	 * notify user that mouse is outside the panel
	 */
	public void mouseExited(MouseEvent event) {
		if (enabledMouse == true) {
			view.getStatusBar1().setStatusOutside();
		}
	}

	/**
	 * position of mouse controls ship
	 */
	public void mouseDragged(MouseEvent event) {
		if (enabledMouse == true)
			model.setDShip(view.translateX(event.getX()));

	}

	/**
	 * position of mouse controls ship
	 */
	public void mouseMoved(MouseEvent event) {
		if (enabledMouse == true)
			model.setDShip(view.translateX(event.getX()));

	}

	/**
	 * Check if enable use of the mouse is on or off
	 * 
	 * @return enableMouse boolean
	 */
	public static boolean isEnabledMouse() {
		return enabledMouse;
	}

	/**
	 * Enables the mouse
	 * 
	 * @param enabledMouse
	 */
	public static void setEnabledMouse(boolean enabledMouse) {
		DInvadersMouseController.enabledMouse = enabledMouse;
	}
}
