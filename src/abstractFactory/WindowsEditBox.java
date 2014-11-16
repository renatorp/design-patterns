package abstractFactory;

public class WindowsEditBox implements EditBox {

	@Override
	public void draw() {
		System.out.println("Desenhando caixa de texto do windows...");
	}

}
