package io.ciera.summit.components;

import io.ciera.summit.application.IActionHome;
import io.ciera.summit.classes.IInstancePopulation;
import io.ciera.summit.exceptions.XtumlException;
import io.ciera.summit.interfaces.IPort;
import io.ciera.summit.types.IXtumlType;

public interface IComponent<C extends IComponent<C>> extends IInstancePopulation, IActionHome<C>, IXtumlType<C> {
    
    public void initialize() throws XtumlException;
    public void satisfy( IPort requiredPort, IPort providedPort );

}
