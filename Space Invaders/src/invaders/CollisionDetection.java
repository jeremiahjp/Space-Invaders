package invaders;

public class CollisionDetection {

	DInvadersView view;
	DInvadersModel model;
	private boolean col0, col1, col2, col3, col4, col5, col6, col7, col8, col9,
			col10, col11, col12, col13, col14; // collisions

	public CollisionDetection(DInvadersView view, DInvadersModel model) {
		this.view = view;
		this.model = model;
	}

	public void detectCollision() {
		if ((EnemyShip.getEnemies()[0] != null && Math.abs((EnemyShip
				.getEnemies()[0].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[0].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location

			col0 = true;
		if (col0 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[0] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col0 = false;
		}

		if ((EnemyShip.getEnemies()[1] != null && Math.abs((EnemyShip
				.getEnemies()[1].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[1].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col1 = true;
		if (col1 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[1] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col1 = false;
		}

		if ((EnemyShip.getEnemies()[2] != null && Math.abs((EnemyShip
				.getEnemies()[2].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[2].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col2 = true;
		if (col2 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[2] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col2 = false;
		}

		if ((EnemyShip.getEnemies()[3] != null && Math.abs((EnemyShip
				.getEnemies()[3].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[3].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col3 = true;
		if (col3 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[3] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col3 = false;
		}

		if ((EnemyShip.getEnemies()[4] != null && Math.abs((EnemyShip
				.getEnemies()[4].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[4].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col4 = true;
		if (col4 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[4] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col4 = false;
		}

		if ((EnemyShip.getEnemies()[5] != null && Math.abs((EnemyShip
				.getEnemies()[5].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[5].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col5 = true;
		if (col5 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[5] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col5 = false;
		}

		if ((EnemyShip.getEnemies()[6] != null && Math.abs((EnemyShip
				.getEnemies()[6].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[6].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col6 = true;
		if (col6 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[6] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col6 = false;
		}

		if ((EnemyShip.getEnemies()[7] != null && Math.abs((EnemyShip
				.getEnemies()[7].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[7].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col7 = true;
		if (col7 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[7] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col7 = false;
		}

		if ((EnemyShip.getEnemies()[8] != null && Math.abs((EnemyShip
				.getEnemies()[8].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[8].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col8 = true;
		if (col8 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[8] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col8 = false;
		}

		if ((EnemyShip.getEnemies()[9] != null && Math.abs((EnemyShip
				.getEnemies()[9].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[9].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col9 = true;
		if (col9 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[9] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col9 = false;
		}

		if ((EnemyShip.getEnemies()[10] != null && Math.abs((EnemyShip
				.getEnemies()[10].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[10].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col10 = true;
		if (col10 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[10] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col10 = false;
		}

		if ((EnemyShip.getEnemies()[11] != null && Math.abs((EnemyShip
				.getEnemies()[11].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[11].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col11 = true;
		if (col11 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[11] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col11 = false;
		}

		if ((EnemyShip.getEnemies()[12] != null && Math.abs((EnemyShip
				.getEnemies()[12].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[12].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col12 = true;
		if (col12 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[12] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col12 = false;
		}

		if ((EnemyShip.getEnemies()[13] != null && Math.abs((EnemyShip
				.getEnemies()[13].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[13].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col13 = true;
		if (col13 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[13] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col13 = false;
		}

		if ((EnemyShip.getEnemies()[14] != null && Math.abs((EnemyShip
				.getEnemies()[14].getX() + 20) - model.getMissile().getMx()) < 20)
				&& (Math.abs((EnemyShip.getEnemies()[14].getY() + 20)
						- model.getMissile().getMy()) < 20))
			// do collision detection here, on collision (missile & enemy), add
			// 1 to the score, remove the missile, start the enemy ship at a new
			// random location
			col14 = true;
		if (col14 == true) {
			model.getMissile().setMy(-1);
			EnemyShip.getEnemies()[14] = null;
			view.getStatusBar1().getScore().incScore();
			view.getStatusBar1().getHits().incHit();
			view.getStatusBar1().getShots().getShot();
			view.getStatusBar1().setStatus();
			col14 = false;
		}
	}

}
