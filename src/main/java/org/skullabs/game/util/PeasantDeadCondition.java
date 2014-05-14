package org.skullabs.game.util;

import org.skullabs.game.people.Peasant;

public class PeasantDeadCondition<T extends Peasant> implements Condition<T> {

	@Override
	public boolean check( T value ) {
		return !value.isAlive();
	}
}
