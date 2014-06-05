package org.skullabs.game.people;

import java.util.Random;

public class Enemy extends Peasant {

	@Override
	public int strike() {
		Random chances = new Random();
		int damage = chances.nextInt( 59 );
		System.out.println( "Enemy attacks! Damage: " + damage );
		return damage;
	}

}
