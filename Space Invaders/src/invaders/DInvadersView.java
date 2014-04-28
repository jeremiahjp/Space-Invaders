package invaders;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 * This class is the View of the Game
 * 
 * @author FBRD
 * 
 */
public class DInvadersView extends JFrame {
	private DInvadersModel model;
	private MainPanel mainPanel;
	private EnemyShipPanel enemyShipPanel;
	private JLabel statusBar;
	private JMenu invadersMenu;
	private JPopupMenu popupMenu;
	private StatusBar statusBar1;

	/**
	 * Constructor
	 * 
	 * @param model
	 *            the model of the game
	 */
	public DInvadersView(DInvadersModel model) {
		super("Duck Invaders");
		this.model = model;
		statusBar1 = new StatusBar(model, this);

		/*
		 * This creates the Menu
		 */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		invadersMenu = new JMenu("Menu");
		invadersMenu.setMnemonic('M');
		menuBar.add(invadersMenu);

		/*
		 * Add a new Menu item
		 */
		JMenuItem helpScreen = new JMenuItem("How To Play");
		helpScreen.setMnemonic('H');
		invadersMenu.add(helpScreen);

		/*
		 * Add a new Menu item
		 */
		JMenuItem pauseItem = new JMenuItem("Pause/Continue");
		pauseItem.setMnemonic('P');
		invadersMenu.add(pauseItem);

		/*
		 * Add a new Menu item
		 */
		JMenuItem enableMouse = new JMenuItem("Enable/Disable Mouse");
		invadersMenu.add(enableMouse);

		JMenuItem exitItem = new JMenuItem("Exit");
		invadersMenu.add(exitItem);

		/*
		 * Create new Popup Menu items
		 */
		popupMenu = new JPopupMenu();
		popupMenu.add(new JMenuItem("How To Play"));
		popupMenu.add(new JMenuItem("Enable/Disable Mouse"));
		popupMenu.add(new JMenuItem("Pause/Continue"));
		popupMenu.add(new JMenuItem("Exit"));

		/*
		 * CENTER: Where the Invaders game is going to be played
		 */
		mainPanel = new MainPanel(model, this);
		add(mainPanel, BorderLayout.CENTER);
		mainPanel.setBackground(Color.BLACK);
		Dimension size = mainPanel.getSize();
		model.setSize(size.width, size.height);

		/*
		 * SOUTH: Where the StatusBar will be set
		 */
		statusBar = new JLabel("");
		statusBar.setBackground(Color.black);
		statusBar.setForeground(Color.white);
		statusBar.setOpaque(true);
		add(statusBar, BorderLayout.SOUTH);
		mainPanel.requestFocus();
	}

	/**
	 * Register event handlers with the appropriate components.
	 * 
	 * @param controller1
	 *            a DInvadersMouseController
	 * @param controller2
	 *            a DInvadersResizeController
	 * @param controller3
	 *            a DInvadersMenuController
	 * @param controller4
	 *            a DInvadersPopupController
	 * @param controller5
	 *            a KeyController
	 */
	public void registerListeners(DInvadersMouseController controller1,
			StatusBar controller2, DInvadersMenuController controller3,
			DInvadersPopupController controller4, KeyController controller5) {
		mainPanel.addMouseListener(controller1);
		mainPanel.addMouseMotionListener(controller1);
		mainPanel.addComponentListener(controller2);
		mainPanel.addKeyListener(controller3);
		this.addMouseListener(controller4);
		mainPanel.addKeyListener(controller5);

		Component[] components = invadersMenu.getMenuComponents();
		for (Component component : components) {
			if (component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller3);
			}
		}

		components = popupMenu.getComponents();
		for (Component component : components) {
			if (component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller3);
			}
		}
	}

	/**
	 * Set the text in the status bar.
	 * 
	 * @param text
	 */
	public void setStatus(String text) {
		statusBar.setText(text);
	}

	/**
	 * Get the status
	 */
	public String getStatus(String text) {
		return statusBar.getText();
	}

	/**
	 * @return The size of the Panel.
	 */
	public Dimension getDuckShipPanelSize() {
		return mainPanel.getSize();
	}

	/**
	 * 
	 * @return The size of the EnemyShip Panel
	 */
	public Dimension getEnemyShipPanelSize() {
		return enemyShipPanel.getSize();
	}

	/**
	 * Translate from mouse x to model x depending on view mode.
	 * 
	 * @param x
	 *            horizontal location of mouse
	 */
	public int translateX(int x) {
		return x;
	}

	/**
	 * Get the StatusBar object
	 * 
	 * @return
	 */
	public StatusBar getStatusBar1() {
		return statusBar1;
	}

	/**
	 * Show popup menu if indicated.
	 * 
	 * @param event
	 */
	public void checkForTriggerEvent(MouseEvent event) {
		if (event.isPopupTrigger()) {
			popupMenu.show(event.getComponent(), event.getX(), event.getY());
		}
	}

}
