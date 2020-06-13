package prototype;

public class BombedWall extends Wall {

	private boolean hasBomb;
	
	public BombedWall() {
	}

	public BombedWall(BombedWall bombedWall) {
		this.hasBomb = bombedWall.isHasBomb();
	}
	
	public boolean isHasBomb() {
		return hasBomb;
	}

	public void setHasBomb(boolean hasBomb) {
		this.hasBomb = hasBomb;
	}

	@Override
	public Wall clonar() {
		return new BombedWall(this);
	}
	
	@Override
	public String toString() {
		return "Booommmm!!";
	}
}
