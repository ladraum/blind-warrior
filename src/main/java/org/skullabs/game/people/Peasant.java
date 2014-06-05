package org.skullabs.game.people;

import java.util.Iterator;

public class Peasant {
	private int health = 100;

	public void fight( Peasant enemy, Iterable<Peasant> population ) {
		boolean isEnemyAnInnocent = false;
		int startingHealth = health;
		while ( this.isAlive() && enemy.isAlive() && !isEnemyAnInnocent ) {
			this.attack( enemy );
			enemy.attack( this );
			if ( startingHealth == health ) {
				isEnemyAnInnocent = true;
				innocentRunAway( enemy, population );
			}
		}
	}

	private void innocentRunAway( Peasant enemy, Iterable<Peasant> population ) {
		Iterator<Peasant> iterator = population.iterator();
		iterator.remove();
	}

	public int strike() {
		return 0;
	}

	private void attack( Peasant defender ) {
		defender.health -= strike();
		System.out.println( "Remaining: " + defender.health );
	}

	public boolean isAlive() {
		return health > 0;
	}

}
