package observer;

/**
 * Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
 *
 * Classes defining application data and presentations can be reused independently.They can work together, too. Both a spreadsheet object and bar chart object can depict information in the same application data object using different presentations.
 * The spreadsheet and the bar chart don't know about each other, thereby letting you reuse only the one you need. But they behave as though they do. When the user changes the information in the spreadsheet, the bar chart reflects the changes immediately, and vice versa.
 *
 * This behavior implies that the spreadsheet and bar chart are dependent on the data object and therefore should be notified of any change in its state
 *
 * This kind of interaction is alson known as publish-subscribe. The subject iss the publisher of notifications. It sends out these notifications without having to know who its observers are. Any number of observers can subscribe to receive notifications.
 *
 * Applicability:
 *  1. When an abstraction has two aspects, one dependent on the other. Encapsulationg these aspects in separate objects lets you vary and reuse them independently.
 *  2. When a change to one object requires changing others, and you dont know how many objects need to be changed.
 *  3. When an object should be able to notify other objects without making assumptions about who these objects are. In other words, you dont want these, objects tightly coupled.
 *
 *  *** When the dependency relationship between subjects and observers is particularly complex, an object that maintains these relationships might be required. We call such an object a ChangeManager.
 *  Its purpose is to minimize the work required to make observers reflect a change in their subject. For example, if an operation involves changes to several interdependent subjects, you might havee to ensure that their observers
 *  are notified only after all the subjects have been modified to avoid notifying observers more than once.
 * @param <T>
 */
public interface Observer<T> {
	void update(T state);
}
