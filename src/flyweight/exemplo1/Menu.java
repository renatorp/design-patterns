package flyweight.exemplo1;

import java.util.HashMap;
import java.util.Map;

//Menu acts as a factory and cache for CoffeeFlavour flyweight objects
public class Menu {
	private Map<String, CoffeeFlavor> flavors = new HashMap<String, CoffeeFlavor>();
	
	public CoffeeFlavor lookup(String flavorName) {
		if (!flavors.containsKey(flavorName)) {
			flavors.put(flavorName, new CoffeeFlavor(flavorName));
		}
		return flavors.get(flavorName);
	}
	
	public int getTotalNumberFlavorsMade() {
		return flavors.size();
	}
}
