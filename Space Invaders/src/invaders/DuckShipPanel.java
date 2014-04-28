package invaders;

/**
 * Class for the Panel where the Player's Ship is located
 * 
 * @author FRBD
 * 
 */
public class DuckShipPanel {
	private DInvadersModel model;
	private DInvadersView view;

	/**
	 * Constructor
	 * 
	 * @param model
	 *            model for the game
	 * @param view
	 *            view for the game
	 */
	public DuckShipPanel(DInvadersModel model, DInvadersView view) {
		this.model = model;
		this.view = view;
	}

}
