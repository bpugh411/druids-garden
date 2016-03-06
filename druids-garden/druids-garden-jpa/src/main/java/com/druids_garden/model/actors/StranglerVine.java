package com.druids_garden.model.actors;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.druids_garden.model.interfaces.Mobile;

/**
 * A {@link Plant} that attacks other non-{@link Mobile} {@link Actor}s.
 */
@Entity
@DiscriminatorValue("Plant")
public class StranglerVine extends Plant {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(StranglerVine.class.getName());

	// Fields

	@OneToMany
	@JoinColumn(name = "actor_id", referencedColumnName = "id")
	private List<PlotProgression> plots;

	// Constructors

	/**
	 * Constructor
	 */
	public StranglerVine() {
		super();
	}

	// Getters and Setters

	/**
	 * Get the plots.
	 *
	 * @return the plots
	 */
	public List<PlotProgression> getPlots() {
		return this.plots;
	}

	/**
	 * Set the plots.
	 *
	 * @param plots the plots to set
	 */
	public void setPlots(List<PlotProgression> plots) {
		this.plots = plots;
	}

	// Other Methods

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final int maxLen = 10;
		return this.getClass().getSimpleName() + " [getId()=" + getId() + ", getDtype()=" + getDtype() + ", getPointOfOrigin()=" + getPointOfOrigin() + ", getPlots()="
		+ (getPlots() != null ? getPlots().subList(0, Math.min(getPlots().size(), maxLen)) : null) + (getPlots().size() > maxLen ? "..." : "") + "]";
	}


}
