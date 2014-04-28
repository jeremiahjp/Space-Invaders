package invaders;

import java.awt.*;
import java.awt.event.*;

/**
 * So I figured that the DInvadersScores.java class could be split into these 4
 * classes. Essentially this class should act as a struct controlling that
 * little status bar at the bottom of the window. As you can see these still
 * need work but I needed to get this down before I forgot.
 * 
 * @author Brian
 * 
 */
public class StatusBar extends ComponentAdapter {

	private Score score;
	private Hits hits;
	private Shots shots;
	private Health health;
	private DInvadersView view;
	private DInvadersModel model;

	public StatusBar(DInvadersModel model, DInvadersView v) {
		score = new Score(0);
		health = new Health(100);
		hits = new Hits(0);
		shots = new Shots(0);
		this.model = model;
		this.view = v;
	}

	public void componentResized(ComponentEvent event) {
		Dimension size = view.getDuckShipPanelSize();
		if (size.width != model.getWidth() || size.height != model.getHeight()) {
			model.setSize(size.width, size.height);
			setStatus();
		}
	}

	public void setStatus() {
		view.setStatus("Score is: " + getScore().getScore() + " | "
				+ "Shot count: " + getShots().getShot() + " | " + "Hit count: "
				+ getHits().getHit() + " | " + "Health: "
				+ getHealth().getHealth());
	}

	public Hits getHits() {
		return hits;
	}

	public Shots getShots() {
		return shots;
	}

	public DInvadersView getView() {
		return view;
	}

	public void setStatusOutside() {
		view.setStatus("Mouse outside playing field");
	}

	public Score getScore() {
		return score;
	}

	public Health getHealth() {
		return health;
	}
}
