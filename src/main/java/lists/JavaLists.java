package lists;

import java.util.List;

public class JavaLists {
	public <E> boolean exists(final List<E> list, final E element) {
		return list.stream().anyMatch(e -> e.equals(element));
	}
}
