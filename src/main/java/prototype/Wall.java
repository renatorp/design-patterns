package prototype;

public class Wall implements MapSite, Prototype<Wall> {

	@Override
	public void enter() {
	}

	@Override
	public Wall clonar() {
		return new Wall(); //tb não tem 
	}
	
	@Override
	public String toString() {
		return "this is a wall";
	}

}
