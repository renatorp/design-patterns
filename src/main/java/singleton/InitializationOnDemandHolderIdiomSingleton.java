package singleton;
/**
 * University of Maryland Computer Science researcher Bill Pugh has written about the code issues underlying the Singleton pattern when implemented in Java.[8] Pugh's efforts on the "Double-checked locking" idiom led to changes in the Java memory model in Java 5 and to what is generally regarded as the standard method to implement Singletons in Java. The technique known as the initialization-on-demand holder idiom is as lazy as possible, and works in all known versions of Java. It takes advantage of language guarantees about class initialization, and will therefore work correctly in all Java-compliant compilers and virtual machines.
 * The nested class is referenced no earlier (and therefore loaded no earlier by the class loader) than the moment that getInstance() is called. Thus, this solution is thread-safe without requiring special language constructs (i.e. volatile or synchronized).
 */
public class InitializationOnDemandHolderIdiomSingleton {
	
	private InitializationOnDemandHolderIdiomSingleton() {
		System.out.println("Initialization-on-demand holder idiom singleton instanciado!");
	}
	
	/**
     * Initializes singleton.
     *
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
	public static class SingletonHolder {
		private static final InitializationOnDemandHolderIdiomSingleton instance = new InitializationOnDemandHolderIdiomSingleton();
	}
	
	public static InitializationOnDemandHolderIdiomSingleton getInstance() {
		return SingletonHolder.instance;
	}
	
}
