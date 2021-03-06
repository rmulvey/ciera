package io.ciera.runtime.summit.classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import io.ciera.runtime.summit.exceptions.XtumlException;
import io.ciera.runtime.summit.types.Set;
import io.ciera.runtime.summit.types.UniqueId;

public class RelationshipSet extends Set<IRelationship> implements IRelationshipSet {

    public RelationshipSet() {
    }

    public RelationshipSet(Comparator<? super IRelationship> comp) {
        super(comp);
    }

    @Override
    public IRelationshipSet getFormalizing(UniqueId part) throws XtumlException {
        return (IRelationshipSet)where(selected -> selected.getPart().equals(part));
    }

    @Override
    public IRelationshipSet getParticipating(UniqueId form) throws XtumlException {
        return (IRelationshipSet)where(selected -> selected.getForm().equals(form));
    }

    @Override
    public IRelationship get(UniqueId form, UniqueId part) throws XtumlException {
        return where(selected -> selected.getForm().equals(form) && selected.getPart().equals(part)).any();
    }

    @Override
    public IRelationship nullElement() {
        return null;
    }

    @Override
    public IRelationshipSet emptySet() {
        return new RelationshipSet();
    }

    @Override
    public IRelationshipSet emptySet(Comparator<? super IRelationship> comp) {
        return new RelationshipSet(comp);
    }

    @Override
    public List<IRelationship> elements() {
        return Arrays.asList(toArray(new IRelationship[0]));
    }

}
