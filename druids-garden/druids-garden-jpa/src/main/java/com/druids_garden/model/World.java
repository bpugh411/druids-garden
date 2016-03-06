package com.druids_garden.model;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.druids_garden.model.actors.Player;

/**
 * General settings for a game.
 */
@Entity
@Table(name = "world")
public class World extends AbstractEntity implements Serializable {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(World.class.getName());

	// Fields

	@Column(name = "name")
	private String name;

	@OneToOne
	@JoinColumn(name = "plat_id", referencedColumnName = "id")
	private Plat plat;

	@OneToMany(mappedBy = "world")
	private List<Player> players;

	// Constructors

	/**
	 * Constructor
	 */
	private World() {
		super();
	}

	// Getters and Setters

	/**
	 * Get the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * Set the name.
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

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
	 * Get the players.
	 *
	 * @return the players
	 */
	public List<Player> getPlayers() {
		return this.players;
	}


	/**
	 * Set the players.
	 *
	 * @param players the players to set
	 */
	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	// Other Methods

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + getId() + ", plat=" + getPlat() + ", players=" + getPlayers() + "]";
	}



}
