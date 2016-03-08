package com.druids_garden.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * A playing board.
 */
@Entity
@Table(name = "plat")
public class Plat extends AbstractEntity implements Serializable {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(Plat.class.getName());

	// Fields

	@OneToMany(fetch = EAGER, cascade = ALL, mappedBy = "plat")
	private List<Plot> plots;

	// Constructors

	/**
	 * Constructor
	 */
	public Plat() {
		super();
	}

	// Getters and Setters

	/**
	 * Get the plots.
	 *
	 * @return the plots
	 */
	public List<Plot> getPlots() {
		return this.plots;
	}

	/**
	 * Set the plots.
	 *
	 * @param plots the plots to set
	 */
	public void setPlots(List<Plot> plots) {
		this.plots = plots;
	}

	// Other Methods

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final int maxLen = 10;
		return this.getClass().getSimpleName() + " [id=" + getId() + ", plots=" + (this.plots != null ? this.plots.subList(0, Math.min(this.plots.size(), maxLen)) : null)
				+ (this.plots.size() > maxLen ? "..." : "") + "]";

	}

}
