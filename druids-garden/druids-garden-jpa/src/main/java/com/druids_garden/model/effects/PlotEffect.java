package com.druids_garden.model.effects;

import java.util.logging.Logger;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.druids_garden.model.Plot;

/**
 * Affects a {@link Plot}.
 */
@Entity
@DiscriminatorValue("PlotEffect")
public class PlotEffect extends Effect {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(PlotEffect.class.getName());

	// Fields

	@ManyToOne
	@JoinColumn(name = "plot_id", referencedColumnName = "id", table = "effect")
	private Plot plot;

	// Constructors

	/**
	 * Constructor
	 */
	public PlotEffect() {
		super();
	}

	// Getters and Setters

	/**
	 * Get the plot.
	 *
	 * @return the plot
	 */
	public Plot getPlot() {
		return this.plot;
	}

	/**
	 * Set the plot.
	 *
	 * @param plot the plot to set
	 */
	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	// Other Methods

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + getId() + ", plot=" + getPlot() + "]";
	}

}
