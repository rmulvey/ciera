package io.ciera.runtime.summit.statemachine;

import io.ciera.runtime.summit.exceptions.XtumlException;

public interface IEvent {
	
	public Object get(int index) throws XtumlException;

}