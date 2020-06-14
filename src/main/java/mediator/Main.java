package mediator;

public class Main {
	public static void main(String[] args) {
		Dialog dialog = new Dialog();
		// With field disabled
		dialog.getTextBox().type("random text");
		dialog.getButton().click();

		//With field enabled
		dialog.getCheckBox().check();
		dialog.getTextBox().type("random text");
		dialog.getButton().click();
	}
}
