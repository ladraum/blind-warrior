package org.skullabs.game;

import org.junit.Test;

public class VillageTest {

	@Test
	public void grantThatVillageExists() {
		new Village();
	}

	@Test
	public void grantThatVillageCanBeInvaded() {
		Village village = new Village();
		village.invade();
	}
}
