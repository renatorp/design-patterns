package flyweight.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
	private List<Order> orders = new ArrayList<Order>();
	private Menu menu = new Menu();
	
	void takeOrder(String flavorName, int table) {
		CoffeeFlavor flavor = menu.lookup(flavorName);
		Order order = new Order(flavor, table);
		orders.add(order);
	}
	
	void service() {
		for (Order order : orders) {
			order.serve();
		}
	}
	
	String report() {
		return "\nTotal number of CoffeeFlavors made: " + menu.getTotalNumberFlavorsMade();
	}
	
	
	public static void main(String[] args) {
		CoffeeShop shop = new CoffeeShop();
		
	    shop.takeOrder("Cappuccino", 2);
	    shop.takeOrder("Frappe", 1);
	    shop.takeOrder("Espresso", 1);
	    shop.takeOrder("Frappe", 897);
	    shop.takeOrder("Cappuccino", 97);
	    shop.takeOrder("Frappe", 3);
	    shop.takeOrder("Espresso", 3);
	    shop.takeOrder("Cappuccino", 3);
	    shop.takeOrder("Espresso", 96);
	    shop.takeOrder("Frappe", 552);
	    shop.takeOrder("Cappuccino", 121);
	    shop.takeOrder("Espresso", 121);
	    
	    shop.service();
	    
	    System.out.println(shop.report());
	}
}
