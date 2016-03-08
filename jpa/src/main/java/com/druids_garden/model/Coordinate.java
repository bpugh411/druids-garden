package com.druids_garden.model;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * A location on {@link Plat}.
 */
@Entity
@Table(name = "coordinate")
public class Coordinate extends AbstractEntity implements Serializable, Comparable<Coordinate> {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(Coordinate.class.getName());

	// Fields

	@Column(name = "row", nullable = false)
	private Integer row;

	@Column(name = "col", nullable = false)
	private Integer col;

	// Constructors

	/**
	 * Constructor
	 */
	public Coordinate() {
		super();
	}

	// Getters and Setters

	/**
	 * Get the row.
	 *
	 * @return the row
	 */
	public Integer getRow() {
		return this.row;
	}

	/**
	 * Set the row.
	 *
	 * @param row the row to set
	 */
	public void setRow(Integer row) {
		this.row = row;
	}

	/**
	 * Get the col.
	 *
	 * @return the col
	 */
	public Integer getCol() {
		return this.col;
	}

	/**
	 * Set the col.
	 *
	 * @param col the col to set
	 */
	public void setCol(Integer col) {
		this.col = col;
	}

	// Other Methods

	/**
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Coordinate o) {
		if ( o != null ) {
			int rowComparison = o.getRow() - getRow();
			if ( rowComparison != 0 ) {
				return rowComparison;
			} else {
				int columnComparison = o.getCol() - getCol();
				return columnComparison;
			}
		} else {
			return 1;
		}
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + getId() + ", row=" + getRow() + ", col=" + getCol() + "]";
	}


}
