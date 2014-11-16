package abstractFactory;

public class MotifLookAndFeelFactory extends LookAndFeelFactory {

	@Override
	Button createButtom() {
		return new MotifButton();
	}

	@Override
	EditBox createEditBox() {
		return new MotifEditBox();
	}

}
