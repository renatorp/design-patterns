package bridge;

public class IconWindow extends Window {

	@Override
	public void drawContents() {
		System.out.println("Drawing contents for icon windows");
		getWindowImp().devBitmap("my_btimap", 10, 55);
	}

}
