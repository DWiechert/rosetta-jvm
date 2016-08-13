package lists;

import java.util.List;

public class JavaLists {
	public Integer sum(final List<Integer> list) {
		return list.stream().reduce((x, y) -> x + y).get();
	}

	public Integer max(final List<Integer> list) {
		return list.stream().max((x, y) -> Integer.compare(x, y)).get();
	}

	public <E> boolean exists(final List<E> list, final E element) {
		return list.stream().anyMatch(e -> e.equals(element));
	}
}
