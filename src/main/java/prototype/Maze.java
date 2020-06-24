package prototype;

import java.util.List;
import java.util.ArrayList;

public class Maze implements Prototype<Maze>{
	List<Room> rooms;

	public Maze() {
		rooms = new ArrayList<Room>();
	}

	@Override
	public Maze clonar() {
		return new Maze(); //N�o tem nenhum par�metro pra setar :(
	}
	
	public void addRoom(Room room) {
		rooms.add(room);
	}

	public List<Room> getRooms() {
		return rooms;
	}
	
}
