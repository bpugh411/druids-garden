package com.druids_garden.controller;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EndpointSupport
 */
@Stateless
@LocalBean
public class EndpointSupport {

	/**
	 * A simple response to acknowledge contact.
	 * 
	 * @return true
	 */
	public boolean test() {
		return true;
	}
}
