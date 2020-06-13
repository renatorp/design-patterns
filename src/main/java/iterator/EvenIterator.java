package iterator;

import java.util.List;

public class EvenIterator implements Iterator {
	private final List<Integer> list;
	private Integer pos;
	private Integer currentItem;
	private Integer lastPos;

	public EvenIterator(List<Integer> list) {
		this.list = list;
		if (!list.isEmpty()) {
			int listLastPos = list.size() - 1;
			lastPos = listLastPos - listLastPos % 2;
		}
	}

	public Integer first() {
		return list.isEmpty() ? null : list.get(0);
	}

	public Integer next() {
		if (list.isEmpty() || pos == lastPos) {
			return null;
		}
		pos = pos == null ? 0 : pos + 2;
		currentItem = list.get(pos);
		return currentItem;
	}

	public Integer currentItem() {
		return currentItem;
	}

	public boolean isDone() {
		return list.isEmpty() || pos == lastPos;
	}
}
