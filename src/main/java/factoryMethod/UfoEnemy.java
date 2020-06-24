package factoryMethod;

public class UfoEnemy extends Enemy {

	public  UfoEnemy() {
		this.setDamage(40);
		this.setName("UFO");
	}
	
	@Override
	void causeDamage() {
		System.out.println(this.getName() + " causing " + this.getDamage() + " of damage with laser gun...");
	}

}
