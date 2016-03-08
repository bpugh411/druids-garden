package com.druids_garden.model.interfaces;

import com.druids_garden.model.actors.Actor;
import com.druids_garden.model.periods.Period;

/**
 * Gives and {@link Actor} the ability to move;
 */
public interface Mobile {

	/**
	 * The distance an {@link Actor} can travel in a single {@link Period}.
	 * 
	 * @return the distance an {@link Actor} can travel in a single {@link Period}
	 */
	public int getSpeed();
}
