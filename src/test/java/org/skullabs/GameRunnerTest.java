package org.skullabs;

import org.junit.Test;

public class GameRunnerTest {

	@Test
	public void grantThatGameRunnerExists() {
		new GameRunner();
	}

	@Test
	public void grantThatGameRunnerCanRunGame() {
		GameRunner.main( null );
	}

}
