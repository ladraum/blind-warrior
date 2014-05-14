package org.skullabs.game;

import java.util.ArrayList;
import java.util.List;

import lombok.Delegate;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.ExtensionMethod;

import org.skullabs.game.people.Enemy;
import org.skullabs.game.util.LangExtension;
import org.skullabs.game.util.PeasantAliveCondition;
import org.skullabs.game.utils.Sizable;

@RequiredArgsConstructor
@ExtensionMethod( LangExtension.class )
public class GermanArmy implements Iterable<Enemy>, Sizable {

	@Delegate( types = { Iterable.class, Sizable.class } )
	final List<Enemy> army;

	public boolean isDefeated() {
		return !army.contains( new PeasantAliveCondition<Enemy>() );
	}

	public static GermanArmy populatedWith( int size ) {
		val newArmy = new ArrayList<Enemy>();
		for ( int i = 0; i < size; i++ )
			newArmy.add( new Enemy() );
		return new GermanArmy( newArmy );
	}
}
