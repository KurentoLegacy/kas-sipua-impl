package com.kurento.commons.ua;

import com.kurento.ua.commons.UA;

import de.javawi.jstun.test.DiscoveryInfo;

public interface UaStun extends UA {

	/**
	 * Return the information of the Stun
	 */
	public DiscoveryInfo getConnectionType() throws Exception;

}
