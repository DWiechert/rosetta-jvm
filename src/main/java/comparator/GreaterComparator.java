package comparator;

import java.util.Comparator;

public class GreaterComparator implements Comparator<Long> {
	@Override
	public int compare(final Long o1, final Long o2) {
		return o1 > o2 ? -1 : 1;
	}
}
