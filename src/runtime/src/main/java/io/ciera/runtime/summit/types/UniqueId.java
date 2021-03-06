package io.ciera.runtime.summit.types;

import java.util.UUID;

import io.ciera.runtime.summit.exceptions.XtumlException;

public class UniqueId implements IXtumlType, Comparable<UniqueId> {

    UUID id;

    public UniqueId() {
        id = new UUID(0, 0);
    }

    public UniqueId(UUID id) {
        this.id = id;
    }

    public UniqueId(UniqueId id) {
        this.id = id.id;
    }

    @Override
    public int compareTo(UniqueId o) {
        return id.compareTo(o.id);
    }

    public void nullify() {
        id = null;
    }

    public boolean isNull() {
        return id == null;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof UniqueId && id.equals(((UniqueId) o).id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        if (null == id)
            return "null";
        else
            return id.toString();
    }

	@Override
	public String serialize() {
		return id.toString();
	}

    public static UniqueId random() {
        return new UniqueId( UUID.randomUUID() );
    }

    public static UniqueId deserialize(Object o) throws XtumlException {
        if (o instanceof UniqueId) {
            return (UniqueId)o;
        }
        else if (o instanceof UUID) {
            return new UniqueId((UUID) o);
        } else if (o instanceof String) {
            return new UniqueId(UUID.fromString((String)o));
        } else if (o instanceof Integer) {
            return new UniqueId(new UUID(0, ((Integer) o).longValue()));
        } else
            throw new XtumlException("Could not get value for type: " + o.getClass().getName());
    }


}
