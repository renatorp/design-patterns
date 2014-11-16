package abstractFactory;

public class WindowsLookAndFeelFactory extends LookAndFeelFactory {

	@Override
	Button createButtom() {
		return new WindowsButton();
	}

	@Override
	EditBox createEditBox() {
		return new WindowsEditBox();
	}

}
