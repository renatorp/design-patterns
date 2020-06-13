package bridge;

public abstract class Window {

	private WindowImp imp;
	
	public void drawText(String text) {
		getWindowImp().devDrawText(text);
	}
	
	public void drawRect(int a, int b, int c, int d) {
		getWindowImp().devDrawLine(a, b);
		getWindowImp().devDrawLine(b, c);
		getWindowImp().devDrawLine(c, d);
		getWindowImp().devDrawLine(d, a);
	}
	
	public abstract void drawContents();
	
	protected WindowImp getWindowImp() {
		if (imp == null) {
			imp = WindowImpFactory.getIntance().createWindow();
		}
		return imp;
	}
}
