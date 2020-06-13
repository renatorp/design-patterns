package singleton;

public class StaticBlockInitializationSingleton {
	private static final StaticBlockInitializationSingleton instance;
	
	static {
		try {
			instance = new StaticBlockInitializationSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro!!");
		}
	}

	public static StaticBlockInitializationSingleton getInstance() {
		return instance;
	}
	
	private StaticBlockInitializationSingleton() {
		System.out.println("Static block initialization singleton instanciado!!");
	}
}
