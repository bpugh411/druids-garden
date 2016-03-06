package com.druids_garden.rest;

import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.druids_garden.controller.EndpointSupport;

/**
 * Application REST endpoints.
 */
@Path("")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Endpoints {

	/** class logger */
	private static final Logger LOG = Logger.getLogger(Endpoints.class.getName());

	@EJB
	private EndpointSupport ejb;

	/**
	 * Simple test to make sure the rest service is online.
	 *
	 * @return a string indicating the service is available
	 */
	@GET
	@Path("test")
	public Response test() {
		String message = "Druid's Garden REST endpoints online";

		message += ", and EJB call";
		if ( this.ejb != null && this.ejb.test() ) {
			message += " was successful";
		} else {
			message += " failed";
		}
		message += ".";

		LOG.info(message);
		return Response.ok(message).build();
	}

	/**
	 * Start a new game.
	 *
	 * @return a new World
	 */
	@GET
	@Path("start-game")
	public Response startGame() {
		return Response.status(Status.SERVICE_UNAVAILABLE).build();
	}
}
