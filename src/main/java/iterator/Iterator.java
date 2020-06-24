package iterator;

/**
 * The key idea of this pattern is to take the responsibility for
 * access and traversal out of the list object and put it into an iterator object
 *
 * Separating the traversal mechanism from the List object lets us define iterators
 * for different traversal policies without enumerating them in the List interface.
 */
public interface Iterator {
	Integer first();
	Integer next();
	Integer currentItem();
	boolean isDone();
}
