package bridge;

public class XWindowImp implements WindowImp {

	@Override
	public void devDrawText(String text) {
		System.out.println("Drawing " + text + "on xwindow system.");
		
	}

	@Override
	public void devDrawLine(int x, int y) {
		System.out.println("xwindow: drawing line from " + x + " to " + y + ".");
	}

	@Override
	public void devBitmap(String bitmapName, int x, int y) {
		System.out.println("xwindow: bitmap " + bitmapName + " used with coordinates " + x + "," + y + ".");
	}

}
