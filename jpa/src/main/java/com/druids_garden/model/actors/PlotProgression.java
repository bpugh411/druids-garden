package com.druids_garden.model.actors;

import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.druids_garden.model.AbstractEntity;
import com.druids_garden.model.Plot;

/**
 * A mapping of {@link Plot}s to the current state of progression.
 */
@Entity
@Table(name="plot_progression")
public class PlotProgression extends AbstractEntity {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(PlotProgression.class.getName());

	// Fields

	/** progressions only have meaning to the container in which they exist */
	@Column(name = "progression", nullable = false)
	private Integer progression;

	@ManyToOne
	@JoinColumn(name = "plot_id", referencedColumnName = "id")
	private Plot plot;

	// Constructors

	/**
	 * Constructor
	 */
	public PlotProgression() {
		super();
	}


	// Getters and Setters

	/**
	 * Get the progression.
	 *
	 * @return the progression
	 */
	public Integer getProgression() {
		return this.progression;
	}

	/**
	 * Set the progression.
	 *
	 * @param progression the progression to set
	 */
	public void setProgression(Integer progression) {
		this.progression = progression;
	}

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
		return this.getClass().getSimpleName() + " [id=" + getId() + ", progression=" + getProgression() + ", plot=" + getPlot() + "]";
	}

}
