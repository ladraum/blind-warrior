package org.skullabs.game;

import java.util.ArrayList;
import java.util.List;

import org.skullabs.game.people.Enemy;
import org.skullabs.game.people.Innocent;
import org.skullabs.game.people.Peasant;

public class GermanArmy {

	private static final int ARMY_SIZE = 90;
	private static final int INNOCENT_SIZE = 10;
	private List<Peasant> army;

	public GermanArmy() {
		buildArmy();
	}

	private void buildArmy() {
		army = new ArrayList<Peasant>();
		for (int i = 0; i < ARMY_SIZE; i++)
			addEnemyToArmy();
		for (int i = 0; i < INNOCENT_SIZE; i++)
			addInnocentToArmy();
	}

	private void addEnemyToArmy() {
		Enemy enemy = new Enemy();
		army.add( enemy );
	}

	private void addInnocentToArmy() {
		Innocent innocent = new Innocent();
		army.add( innocent );
	}

}
