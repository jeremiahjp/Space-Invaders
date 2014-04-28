package invaders;

import java.awt.event.*;

/**
 * This class passes the decision to show the popup menu to the View.
 * 
 * @author FBRD
 */
public class DInvadersPopupController extends MouseAdapter {

	private DInvadersModel model;
	private DInvadersView view;

	/**
	 * Constructor
	 * 
	 * @param model
	 *            the model of this Pong game
	 * @param view
	 *            the view of this Pong game
	 */
	public DInvadersPopupController(DInvadersModel model, DInvadersView view) {
		this.model = model;
		this.view = view;
	}

	/**
	 * Go back to the view object to do the pop up menu.
	 */
	public void mousePressed(MouseEvent event) {
		view.checkForTriggerEvent(event);
	} // end method mousePressed

	/**
	 * Go back to the view object to do the pop up menu.
	 */
	public void mouseReleased(MouseEvent event) {
		view.checkForTriggerEvent(event);
	}
}
