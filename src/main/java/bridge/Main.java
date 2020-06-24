package bridge;

public class Main {
	public static void main(String[] args) {

		// Creating a application window		
		System.out.println("--APPLICATION WINDOW---------------------");
		ApplicationWindow applicationWindow = new ApplicationWindow();
		applicationWindow.drawContents();
		applicationWindow.drawText("Texto 2");
		applicationWindow.drawRect(100, 200, 300, 400);
		System.out.println();
		
		// Creating an icon window
		System.out.println("--ICON WINDOW---------------------");
		IconWindow iconWindow = new IconWindow();
		iconWindow.drawContents();
		iconWindow.drawText("Texto 1");
		iconWindow.drawRect(10, 20, 30, 40);
		
	}
}
