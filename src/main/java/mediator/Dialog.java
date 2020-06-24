package mediator;

public class Dialog implements Mediator {
	private TextBox textBox;
	private CheckBox checkBox;
	private Button button;

	public Dialog() {
		this.textBox = new TextBox(this);
		this.checkBox = new CheckBox(this);
		this.button = new Button(this);
	}

	public void notify(Component component, Component.Event event) {
		if (component == textBox && event == Component.Event.TYPE) {
			if (textBox.getText().length() > 0) {
				button.setDisabled(false);
			}
		}

		if (component == checkBox && event == Component.Event.CHECK) {
			this.textBox.setDisabled(false);
		}

		if (component == button && event == Component.Event.CLICK) {
			System.out.println("Value is: " + this.textBox.getText());
		}
	}

	public TextBox getTextBox() {
		return textBox;
	}

	public CheckBox getCheckBox() {
		return checkBox;
	}

	public Button getButton() {
		return button;
	}
}
