package com.druids_garden.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Parent of all Druid's Garden entities.
 */
@MappedSuperclass
public class AbstractEntity {

	// Fields

	@Id
	@Column(name = "id", unique = true, nullable = false, updatable = false, insertable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Getters and Setters

	/**
	 * Get the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Set the id.
	 *
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	// Other Methods

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if ( this == obj )
			return true;
		if ( obj == null )
			return false;
		if ( getClass() != obj.getClass() )
			return false;
		AbstractEntity other = (AbstractEntity) obj;
		if ( this.id == null ) {
			if ( other.id != null )
				return false;
		} else if ( !this.id.equals(other.id) )
			return false;
		return true;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + getId() + "]";
	}

}
