package org.skullabs.game.util;

public class LangExtension {

	public static <T> boolean contains( Iterable<T> self, Condition<T> condition ) {
		for ( T object : self )
			if ( condition.check( object ) )
				return true;
		return false;
	}
}
