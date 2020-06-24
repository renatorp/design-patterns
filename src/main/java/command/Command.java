package command;

/**
 * - Encapsulate a request as an object, thereby letting you parametrize clients with different requests, queue or log requests, and support undoable operations.
 * - Command decouples the object that invokes the operation from the one that knows how to perform it.
 * - It's easy to add new Commands, because, you don't have to change existing classes
 */
public interface Command<T extends Receiver> {
	void execute(T receiver);
}
