package flyweight.exemplo1;

public class Order {
	private int tableNumber;
	private CoffeeFlavor coffeeFlavor;
	
	public Order(CoffeeFlavor coffeeFlavor, int tableNumber) {
		this.coffeeFlavor = coffeeFlavor;
		this.tableNumber = tableNumber;
	}
	
	void serve() {
		System.out.println("Serving " + coffeeFlavor + " to table " + tableNumber);
	}
}
