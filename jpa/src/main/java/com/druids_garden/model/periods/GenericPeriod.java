package com.druids_garden.model.periods;

import java.util.logging.Logger;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Non-specific period of time.
 */
@Entity
@DiscriminatorValue("GenericPeriod")
public class GenericPeriod extends Period {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(GenericPeriod.class.getName());

	// Fields

	// Constructors

	/**
	 * Constructor
	 */
	public GenericPeriod() {
		super();
	}

	// Getters and Setters

	// Other methods

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString();
	}

}
