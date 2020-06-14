package mediator;

/**
 * A mediator is responsible for controlling and coordinating the interactions
 * of a group of objects.
 * The mediator serves as an intermediary that keeps objects in the group from
 * referring to each other explicitly.
 * 1. It limits subclassing. Amediator localizes behavior that otherwise would be distributed among several objects. Changing this behavior requires subclassing Mediator only; Colleague classes can be reused as is.
 * 2. It decouples colleagues. A mediator promotes loose couplling between colleagues. You can vary and reuse Colleague and Mediator classes independently.
 * 3. It simiplifies object protocols. A mediator replaces many-to-many interactions with one-to-many interactions between the mediator and its colleagues.
 * 4. It abstracts how objects cooperate. Making mediation anindependent concept and encapsulating it in an object lets you focus on how objects interact apart from their individual behavior. That can help clarify how objects interact in a system.
 * 5. It centralizes control. The Mediator pattern trades complexity of interaction for complexity in the mediator. Because a mediator encapsulates protocols, it can became more complex than any individual colleague. This can make the mediator itself a monolith that's hard to maintain.
 */
public interface Mediator {
	void notify(Component component, Component.Event event);
}
