package org.skullabs.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.experimental.Accessors;
import lombok.experimental.ExtensionMethod;

import org.skullabs.game.people.Hero;
import org.skullabs.game.people.Innocent;
import org.skullabs.game.people.Peasant;
import org.skullabs.game.util.LangExtension;
import org.skullabs.game.util.PeasantDeadCondition;

@Accessors( fluent = true )
@ExtensionMethod( LangExtension.class )
public class Village {

	private static final int VILLAGE_INNOCENT_SIZE = 20;
	@Getter
	final Hero hero = new Hero();
	Iterable<Innocent> citizens;
	List<Peasant> population;

	public void build() {
		ArrayList<Innocent> innocents = new ArrayList<Innocent>();
		for ( int i = 0; i < VILLAGE_INNOCENT_SIZE; i++ )
			innocents.add( new Innocent() );
		this.citizens = innocents;
		this.population = createAPopulationFrom( innocents );
	}

	private List<Peasant> createAPopulationFrom( Iterable<Innocent> citizens ) {
		ArrayList<Peasant> arrayList = new ArrayList<Peasant>();
		for ( Peasant peasant : citizens )
			arrayList.add( (Peasant)peasant );
		return arrayList;
	}

	public <T extends Peasant> void beInvadedBy( Iterable<T> army ) {
		this.population.addAll( (Collection<T>)army );
		Collections.shuffle( this.population );
	}

	public Iterable<Peasant> population() {
		return population;
	}

	public boolean isAnyCitizenDead() {
		return citizens.contains( new PeasantDeadCondition<Innocent>() );
	}
}
