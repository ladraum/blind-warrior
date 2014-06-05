package org.skullabs.game;

import java.util.ArrayList;
import java.util.List;

import lombok.val;

import org.skullabs.game.people.Enemy;
import org.skullabs.game.people.Hero;
import org.skullabs.game.people.Innocent;
import org.skullabs.game.people.Peasant;

public class BlindWarriorGame {

	final List<Innocent> citizens = new ArrayList<Innocent>();
	final Village village = new Village();
	final Iterable<Enemy> army = GermanArmy.populatedWith( 100 );

	public static void main( String[] args ) {
		BlindWarriorGame game = new BlindWarriorGame();
		game.run();
	}

	public void run() {
		village.build();
		val population = village.population();
		val hero = village.hero();
		angryHeroAttacksTheArmy( hero, population );
	}

	void angryHeroAttacksTheArmy( Hero hero, Iterable<Peasant> population ) {
		if ( !hero.isAlive() || village.isAnyCitizenDead() )
			gameLost();
		if ( invasionIsOver( population ) )
			gameWon();
		hero.attackNextEnemy( population );
	}

	private boolean invasionIsOver( Iterable<Peasant> population ) {
		for ( Peasant person : population )
			if ( person.getClass().equals( Enemy.class ) && person.isAlive() )
				return true;
		return false;
	}

	private void gameWon() {
		System.out.println( "Game won!! Contratz!" );
	}

	private void gameLost() {
		System.out.println( "Game lost" );
	}
}
