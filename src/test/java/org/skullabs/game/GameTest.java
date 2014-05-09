package org.skullabs.game;

import org.junit.Test;

public class GameTest {

	@Test
	public void grantThatGameExists() {
		new Game();
	}

	@Test
	public void grantThatGameRun() {
		Game.run();
	}

}
