package com.eventmanagement.com.emc.managers;

import com.eventmanagement.com.emc.entities.Event;

public class EventManagerImpl implements EventManager {

	@Override
	public Event create(Long id) {
		return new Event(id, null, null);
	}

}
