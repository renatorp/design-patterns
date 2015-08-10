package factoryMethod;

public class EnemyFactory {
	private enum EnemyType {U,D};
	
	public static Enemy createEnemy(String strType) {
		EnemyType type = EnemyType.valueOf(strType);
		switch (type) {
			case U:	return new UfoEnemy();
			case D:	return new DemonEnemy();
			default: return null;
		}
	}
}
