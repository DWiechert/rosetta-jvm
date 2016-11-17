package lists;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

	public <E> int indexOf(final List<E> list, final E element) {
		int index = 0;
		for (final E e : list) {
			if (e.equals(element)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public <E> long count(final List<E> list, final E element) {
		return list.stream().filter(e -> e.equals(element)).count();
	}

	public <E> List<E> order(final List<E> list, final Comparator<E> comparator) {
		return list.stream().sorted(comparator).collect(Collectors.toList());
	}
}
