package com.druids_garden.model;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A single affectable spot on the {@link Plat}.
 */
@Entity
@Table(name = "plot")
public class Plot extends AbstractEntity implements Serializable, Comparable<Plot> {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(Plot.class.getName());

	// Fields

	@ManyToOne
	@JoinColumn(name = "plat_id", referencedColumnName = "id", table = "plot")
	private Plat plat;

	@OneToOne
	@JoinColumn(name = "coordinate_id", referencedColumnName = "id", table = "plot")
	private Coordinate coordinate;

	// Constructors

	/**
	 * Constructor
	 */
	public Plot() {
		super();
	}

	// Getters and Setters

	/**
	 * Get the plat.
	 *
	 * @return the plat
	 */
	public Plat getPlat() {
		return this.plat;
	}

	/**
	 * Set the plat.
	 *
	 * @param plat the plat to set
	 */
	public void setPlat(Plat plat) {
		this.plat = plat;
	}

	/**
	 * Get the coordinate.
	 *
	 * @return the coordinate
	 */
	public Coordinate getCoordinate() {
		return this.coordinate;
	}

	/**
	 * Set the coordinate.
	 *
	 * @param coordinate the coordinate to set
	 */
	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	// Other Methods

	/**
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Plot o) {
		if(o!=null) {
			return getCoordinate().compareTo(o.getCoordinate());
		} else {
			return 1;
		}
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + getId() + ", plat=" + getPlat() + ", coordinate=" + getCoordinate() + "]";
	}


}
