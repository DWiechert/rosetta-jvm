package exists;

import java.util.Collection;

public class ExistsJava {
	public <E> boolean exists(final Collection<E> collection, final E element) {
		return collection.stream().anyMatch(e -> e.equals(element));
	}
}
