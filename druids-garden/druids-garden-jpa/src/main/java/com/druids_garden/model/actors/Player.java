package com.druids_garden.model.actors;

import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.druids_garden.model.World;
import com.druids_garden.model.interfaces.Mobile;

/**
 * A player of the game.
 */
@Entity
@DiscriminatorValue("Player")
public class Player extends Actor implements Mobile {

	/** class logger */
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(Player.class.getName());

	// Fields

	@Column(name = "name")
	private String name;

	@Column(name = "speed")
	private int speed;

	@ManyToOne
	private World world;

	// Constructors

	/**
	 * Constructor
	 */
	public Player() {
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
	 * Get the speed.
	 *
	 * @return the speed
	 */
	@Override
	public int getSpeed() {
		return this.speed;
	}

	/**
	 * Set the speed.
	 *
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * Get the world.
	 *
	 * @return the world
	 */
	public World getWorld() {
		return this.world;
	}

	/**
	 * Set the world.
	 *
	 * @param world the world to set
	 */
	public void setWorld(World world) {
		this.world = world;
	}

	// Other Methods

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + getId() + ", getDtype()=" + getDtype() + ", name=" + getName() + "]";
	}


}
