package com.druids_garden.model.actors;

import java.util.logging.Logger;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.druids_garden.model.Plot;

/**
 * A plant.
 */
@MappedSuperclass
public abstract class Plant extends Actor {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(Plant.class.getName());

	// Fields

	@ManyToOne
	@JoinColumn(name = "pointOfOrigin_id", referencedColumnName = "id")
	private Plot pointOfOrigin;

	// Constructors

	/**
	 * Constructor
	 */
	public Plant() {
		super();
	}

	// Getters and Setters

	/**
	 * Get the pointOfOrigin.
	 *
	 * @return the pointOfOrigin
	 */
	public Plot getPointOfOrigin() {
		return this.pointOfOrigin;
	}

	/**
	 * Set the pointOfOrigin.
	 *
	 * @param pointOfOrigin the pointOfOrigin to set
	 */
	public void setPointOfOrigin(Plot pointOfOrigin) {
		this.pointOfOrigin = pointOfOrigin;
	}

	// Other Methods

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + getId() + ", getDtype()=" + getDtype() + ", pointOfOrigin=" + getPointOfOrigin() + "]";
	}

}
