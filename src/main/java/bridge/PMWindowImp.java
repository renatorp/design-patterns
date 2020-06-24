package bridge;

public class PMWindowImp implements WindowImp {

	@Override
	public void devDrawText(String text) {
		System.out.println(text + " being drawn on Presentation Manager.");
	}

	@Override
	public void devDrawLine(int x, int y) {
		System.out.println("Line " + x + " to " + y + " being drawn (PM).");
	}
	
	@Override
	public void devBitmap(String bitmapName, int x, int y) {
		System.out.println("PM: bitmap " + bitmapName + " used with coordinates " + x + "," + y + ".");
	}

}
