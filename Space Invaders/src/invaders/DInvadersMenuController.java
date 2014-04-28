package invaders;

import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 * The Menu Controller for the game
 * 
 * @author FBRD
 * 
 */
public class DInvadersMenuController extends KeyAdapter implements
		ActionListener {
	private DInvadersModel model;
	private DInvadersView view;

	/**
	 * Constructor of the class
	 * 
	 * @param model
	 *            the model of this Invaders game
	 * @param view
	 *            the view of this Invaders game
	 */
	public DInvadersMenuController(DInvadersModel model, DInvadersView view) {
		this.model = model;
		this.view = view;
	}

	/**
	 * Handle the menu item that was selected.
	 */
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if (command.equals("Exit")) {
			view.dispose();
			System.exit(0);
		} else if (command.equals("Pause/Continue")) {
			model.setPause(!model.getPause());
			KeyController.getT().stop();
			JOptionPane.showMessageDialog(view, "Game Is Paused");
			KeyController.getT().start();
		} else if (command.equals("Enable/Disable Mouse")) {
			if (DInvadersMouseController.isEnabledMouse() == false) {
				DInvadersMouseController.setEnabledMouse(true);
			} else if (DInvadersMouseController.isEnabledMouse() == true)
				DInvadersMouseController.setEnabledMouse(false);
		} else if (command.equals("How To Play")) {
			KeyController.getT().stop();
			JOptionPane
					.showMessageDialog(
							view,
							"This will explain how you play"
									+ "\n"
									+ "\n"
									+ "How To Shoot: Press Spacebar or left mouse click to fire\n"
									+ "How To Move: By default, the keyboard is enabled and the mouse is disabled. \n"
									+ "How to Enable the Mouse: Click the toggle in the menu.\n"
									+ "To Pause press 'P' or Menu Pause/Continue\n"
									+ "To Quit the game, press the menu button and click Exit or press ESC.\n");
			KeyController.getT().start();
		}
	}
}
