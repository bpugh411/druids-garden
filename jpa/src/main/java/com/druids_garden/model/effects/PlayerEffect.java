package com.druids_garden.model.effects;

import java.util.logging.Logger;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.druids_garden.model.actors.Player;

/**
 * Affects a {@link Player}.
 */
@Entity
@DiscriminatorValue("PlayerEffect")
public class PlayerEffect extends Effect {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(PlayerEffect.class.getName());

	// Fields

	@ManyToOne
	@JoinColumn(name = "player_id", referencedColumnName = "id", table = "effect")
	private Player player;

	// Constructors

	/**
	 * Constructor
	 */
	public PlayerEffect() {
		super();
	}


	// Getters and Setters

	/**
	 * Get the player.
	 *
	 * @return the player
	 */
	public Player getPlayer() {
		return this.player;
	}

	/**
	 * Set the player.
	 *
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	// Other Methods

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + getId() + ", player=" + getPlayer() + "]";
	}

}
