package invaders;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class is an event handler for when the Pong's panel is resized.
 * 
 * @author FBRD
 */

public class DInvadersResizeController extends ComponentAdapter {
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

	public DInvadersResizeController(DInvadersModel model, DInvadersView view) {
		this.model = model;
		this.view = view;
	}

	/**
	 * Ensure that the model gets the correct size of the Panel.
	 */

	public void componentResized(ComponentEvent event) {
		Dimension size = view.getDuckShipPanelSize();
		if (size.width != model.getWidth() || size.height != model.getHeight()) {
			model.setSize(size.width, size.height);
			view.setStatus("Score is ");
		}
	}

}
