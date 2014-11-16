package abstractFactory;

public class WindowsButton implements Button {

	@Override
	public void draw() {
		System.out.println("Desenhando botão do windows...");
	}

}
