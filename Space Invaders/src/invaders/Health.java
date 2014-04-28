package invaders;

public class Health {
	private int health;

	public Health(int health) {
		this.health = health;

	}

	public int getHealth() {
		return health;
	}

	public void decrementHealth() {
		health = health - 10;
	}

}
