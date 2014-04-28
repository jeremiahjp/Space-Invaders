package invaders;

import javax.swing.*;

/**
 * This is the Duck Invaders game
 * 
 * @author FireBreathingRubberDuckies
 * 
 */
public class DuckInvaders {
	/**
	 * Create the objects for the model, view and controller, and launch the
	 * application.
	 */
	public static void main(String[] args) {

		/* create new model, view and controller */
		DInvadersModel model = new DInvadersModel();
		DInvadersView view = new DInvadersView(model);
		StatusBar statusBar = new StatusBar(model, view);
		DInvadersMouseController mouseController = new DInvadersMouseController(
				model, view);
		DInvadersMenuController menuController = new DInvadersMenuController(
				model, view);
		DInvadersPopupController popupController = new DInvadersPopupController(
				model, view);
		KeyController keyController = new KeyController(model, view);
		// repaint timer so that the window will update every 25 ms
		KeyController.getT().start();

		/* register other controllers as listeners */
		view.registerListeners(mouseController, statusBar, menuController,
				popupController, keyController);

		/* start it up */
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(800, 600);
		view.setVisible(true);
		view.setFocusable(true);
		view.setResizable(false);
	}

}
