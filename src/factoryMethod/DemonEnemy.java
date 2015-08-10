package factoryMethod;

public class DemonEnemy extends Enemy {

	public  DemonEnemy() {
		this.setDamage(80);
		this.setName("Demon");
	}
	
	@Override
	void causeDamage() {
		System.out.println(this.getName() + " causing " + this.getDamage() + " of damage with fire ball...");
	}

}
