package bridge;

public class WindowImpFactory {
	private static WindowImpFactory factory;
	
	public static WindowImpFactory getIntance() {
		if (factory == null) {
			factory = new WindowImpFactory();
		}
		return factory;
	}
	
	public WindowImp createWindow() {
		if (getRandomNumber() == 0) {
			return new XWindowImp();
		}
		return new PMWindowImp();
	}

	private static Long randomNumber;
	
	private Long getRandomNumber() {
		if (randomNumber == null) {
			randomNumber = System.currentTimeMillis() % 2; 
		}
		return randomNumber;
	}
	
}
