package iterator;

import java.util.Arrays;
import java.util.List;

public class NumbersListImpl implements NumbersList {
	private final List<Integer> list;

	public NumbersListImpl(Integer... i) {
		list = Arrays.asList(i);
	}

	public Iterator evenIterator() {
		return new EvenIterator(list);
	}
}
