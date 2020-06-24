package memento;

/**
 * Sometimes it's necessary to record the internal state of an oject.
 * This is required when implementing checkpoints and undo mechanisms that let users back
 * out of tentative operations or recover from errors. You must save state information somewhere
 * so that you can restore objects to their previous states. But objects normally encapsulate some or all
 * of their state, making it inaccessible to other objects and impossible to save externally.
 * Exposing this state would violate encapsulation, which can compromise the applications reliability
 * and extensibility.
 *
 * We can solve this problem with the Memento pattern. A memento is an object that stores a snapshot of
 * the internal state of another object - the memento's originator.
 */
public interface Memento {
	void restore();
}
