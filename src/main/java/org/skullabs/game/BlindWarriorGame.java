package org.skullabs.game;

import lombok.val;

import org.skullabs.game.people.Enemy;
import org.skullabs.game.people.Hero;
import org.skullabs.game.people.Peasant;

public class BlindWarriorGame {

	final Village village = new Village( null );
	final Iterable<Enemy> army = GermanArmy.populatedWith( 100 );

	public void run() {
		village.beInvadedBy( army );
		val population = village.population();
		val hero = village.hero();
		angryHeroAttacksTheArmy( hero, population );
	}

	void angryHeroAttacksTheArmy( Hero hero, Iterable<Peasant> population ) {
		// verificar se o heroi ta vivo
		// se matou algum inocente
		// se ainda existe um exercito a ser vencido

	}
}
