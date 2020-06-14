package mediator;

public class Button implements Component {
	private final Mediator mediator;
	private boolean disabled = true;

	public Button(Mediator mediator) {
		this.mediator = mediator;
	}

	public void click() {
		if (!disabled) {
			this.mediator.notify(this, Event.CLICK);
		} else {
			System.out.println("Can't click");
		}
	}

	public void setDisabled(boolean b) {
		this.disabled = b;
	}

	public boolean getDisabled() {
		return disabled;
	}
}
