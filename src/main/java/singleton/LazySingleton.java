package singleton;

public class LazySingleton {
	private static LazySingleton instance = null;

	private LazySingleton() {
		System.out.println("Lazy Singleton instanciado");
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
