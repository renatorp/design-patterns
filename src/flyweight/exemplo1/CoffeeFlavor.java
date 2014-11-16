package flyweight.exemplo1;

//Instances of CoffeeFlavour will be the Flyweights
public class CoffeeFlavor {

	private String name;
	
	public CoffeeFlavor(String newFlavor) {
		this.name = newFlavor;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
