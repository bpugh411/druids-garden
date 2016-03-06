package com.druids_garden.model.effects;

import static javax.persistence.DiscriminatorType.STRING;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.InheritanceType.SINGLE_TABLE;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Mutable;

import com.druids_garden.model.AbstractEntity;
import com.druids_garden.model.actions.Action;

/**
 * Result of an {@link Action}.
 */
@Entity
@Table(name = "effect")
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype", discriminatorType = STRING)
public abstract class Effect extends AbstractEntity implements Serializable {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(Effect.class.getName());

	// Fields

	@Column(name = "dtype", insertable = false, updatable = false, nullable = false, unique = false)
	@Basic(fetch = EAGER, optional = false)
	@Mutable(false)
	private String dtype;

	// Constructors

	/**
	 * Constructor
	 */
	public Effect() {
		super();
	}

	// Getters and Setters

	/**
	 * Get the dtype.
	 *
	 * @return the dtype
	 */
	public String getDtype() {
		return this.dtype;
	}

	/**
	 * Set the dtype.
	 *
	 * @param dtype the dtype to set
	 */
	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	// Other Methods

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + getId() + ", dtype=" + getDtype() + "]";
	}

}
