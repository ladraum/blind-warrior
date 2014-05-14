package org.skullabs.game;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.experimental.Accessors;
import lombok.experimental.ExtensionMethod;

import org.skullabs.game.people.Hero;
import org.skullabs.game.people.Peasant;
import org.skullabs.game.util.LangExtension;
import org.skullabs.game.util.PeasantDeadCondition;

@Accessors( fluent = true )
@ExtensionMethod( LangExtension.class )
public class Village {

	@Getter
	final Hero hero = new Hero();
	final Iterable<Peasant> citizens;
	final List<Peasant> population;

	public Village( Iterable<Peasant> citizens ) {
		this.citizens = citizens;
		this.population = createAPopulationFrom( citizens );
	}

	private List<Peasant> createAPopulationFrom( Iterable<Peasant> citizens ) {
		ArrayList<Peasant> arrayList = new ArrayList<Peasant>();
		//
		return arrayList;
	}

	public <T extends Peasant> void beInvadedBy( Iterable<T> army ) {

	}

	public Iterable<Peasant> population() {
		return population;
	}

	public boolean isAnyCitizenDead() {
		return citizens.contains( new PeasantDeadCondition<Peasant>() );
	}
}
