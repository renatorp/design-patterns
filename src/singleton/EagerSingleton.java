package singleton;

/**
 * Advantages
 * The instance is not constructed until the class is used.
 * There is no need to synchronize the getInstance() method, meaning all threads will see the same instance and no (expensive) locking is required.
 * The final keyword means that the instance cannot be redefined, ensuring that one (and only one) instance ever exists.
 *
 */
public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		System.out.println("Eager singleton instanciado");
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}
