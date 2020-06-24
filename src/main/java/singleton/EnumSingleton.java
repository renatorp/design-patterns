package singleton;

public enum EnumSingleton {
	INSTANCE;
	
	public void execute(String op) {
		System.out.println("Executando " + op);
	}

}
