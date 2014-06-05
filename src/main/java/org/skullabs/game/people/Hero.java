package org.skullabs.game.people;

import java.util.Random;

public class Hero extends Peasant {

	@Override
	public int strike() {
		Random chances = new Random();
		int damage = chances.nextInt( 39 );
		System.out.println( "Hero attacks! Damage: " + damage );
		return damage;
	}

	public void attackNextEnemy( Iterable<Peasant> population ) {
		for ( Peasant enemy : population )
			if ( enemy.isAlive() )
				this.fight( enemy, population );
	}

}
