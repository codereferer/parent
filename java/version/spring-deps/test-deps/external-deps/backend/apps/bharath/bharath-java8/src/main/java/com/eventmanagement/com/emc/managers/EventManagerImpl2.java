package com.eventmanagement.com.emc.managers;

import com.eventmanagement.com.emc.entities.Event;

public class EventManagerImpl2 implements EventManager {

	@Override
	public Event create(Long id) {
		return new Event(id, "Mac Book Launch", "New Generation Of Mac Books Launch");
	}

}