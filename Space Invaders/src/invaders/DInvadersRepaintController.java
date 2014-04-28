package invaders;

import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * This class is an event handler for the Timer. This is set up in the main
 * method in the DuckInvaders class.
 * 
 * @author FBRD
 */
public class DInvadersRepaintController extends JPanel implements
		ActionListener {
	private DInvadersModel model;
	private DInvadersView view;

	/**
	 * Constructor
	 * 
	 * @param model
	 *            the model of this game
	 * @param view
	 *            the view of this game
	 */
	public DInvadersRepaintController(DInvadersModel model, DInvadersView view) {
		this.model = model;
		this.view = view;
	}

	/**
	 * Handle the events performed and update the hits and misses
	 */
	public void actionPerformed(ActionEvent event) {
		int hits = model.getHits();
		int misses = model.getMisses();
		if (hits != model.getHits() || misses != model.getMisses()) {
			view.setStatus(model.getHits() + " hits, " + model.getMisses()
					+ " misses");
		}
		view.repaint();
	}

}
