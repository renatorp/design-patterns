package mediator;

public class TextBox implements Component {
	private final Mediator mediator;
	private boolean disabled = true;
	private String text;

	public TextBox(Mediator mediator) {
		this.mediator = mediator;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public boolean getDisabled() {
		return disabled;
	}

	public void type(String text) {
		if (disabled) {
			System.out.println("Can't type");
		} else {
			this.text = text;
			mediator.notify(this, Event.TYPE);
		}
	}

	public String getText() {
		return this.text;
	}
}
