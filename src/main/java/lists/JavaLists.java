package lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaLists {
	public Integer sum(final List<Integer> list) {
		return list.stream().reduce((x, y) -> x + y).get();
	}

	public Integer max(final List<Integer> list) {
		return list.stream().max(Comparator.comparingInt(x -> x)).get();
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

	public <E> List<E> zip(final List<E> list1, final List<E> list2) {
		final List<E> zipped = new ArrayList<>(list1.size() * 2);
		for (int i = 0; i < list1.size(); i++) {
			zipped.add(list1.get(i));
			zipped.add(list2.get(i));
		}
		return zipped;
	}
}
