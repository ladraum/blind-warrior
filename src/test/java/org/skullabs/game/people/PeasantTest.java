package org.skullabs.game.people;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class PeasantTest {

	@Test
	public void whenIsBornThenIsAlive() {
		Peasant person = new Peasant();
		assertThat( person.isAlive(), is( true ) );
	}

}
