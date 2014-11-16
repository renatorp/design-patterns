package singleton;

public class Teste {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EagerSingleton es = EagerSingleton.getInstance();
		InitializationOnDemandHolderIdiomSingleton iodhi = InitializationOnDemandHolderIdiomSingleton.getInstance();
		LazySingleton ls = LazySingleton.getInstance();
		StaticBlockInitializationSingleton sbi = StaticBlockInitializationSingleton.getInstance();
		EnumSingleton.INSTANCE.execute("OP teste");
		
		EagerSingleton es2 = EagerSingleton.getInstance();
		InitializationOnDemandHolderIdiomSingleton iodhi2 = InitializationOnDemandHolderIdiomSingleton.getInstance();
		LazySingleton ls2 = LazySingleton.getInstance();
		StaticBlockInitializationSingleton sbi2 = StaticBlockInitializationSingleton.getInstance();
		
		EagerSingleton es3 = EagerSingleton.getInstance();
		InitializationOnDemandHolderIdiomSingleton iodhi3 = InitializationOnDemandHolderIdiomSingleton.getInstance();
		LazySingleton ls3 = LazySingleton.getInstance();
		StaticBlockInitializationSingleton sbi3 = StaticBlockInitializationSingleton.getInstance();
	}

}
