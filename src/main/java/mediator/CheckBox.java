package mediator;

public class CheckBox implements Component {
	private final Mediator mediator;
	public CheckBox(Mediator mediator) {
		this.mediator = mediator;
	}

	public void check() {
		mediator.notify(this, Event.CHECK);
	}
}
