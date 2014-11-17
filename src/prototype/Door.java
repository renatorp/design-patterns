package prototype;

public class Door implements MapSite, Prototype<Door> {
	
	private Room r1;
	private Room r2;
	boolean open;
	
	public Door() {
	}
	
	public Door(Door door) {
		open = door.isOpen();
		r1 = door.getR1();
		r2 = door.getR2();
	}
	
	public void inicializar(Room r1, Room r2) {
		this.r1 = r1;
		this.r2 = r2;
		open = false;
	}

	public Room getR1() {
		return r1;
	}
	public void setR1(Room r1) {
		this.r1 = r1;
	}

	public Room getR2() {
		return r2;
	}
	public void setR2(Room r2) {
		this.r2 = r2;
	}

	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}

	@Override
	public void enter() {
	}

	@Override
	public Door clonar() {
		return new Door(this);
	}

}
