package prototype;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite, Prototype<Room> {

	public enum Direction {NORTH, SOUTH, EAST, WEST};
	
	Map<Direction, MapSite> sides;
	int roomNumber;

	public Room() {
		sides = new HashMap<Room.Direction, MapSite>();
	}
	
	public Room(Room room) {
		this();
		roomNumber = room.getRoomNumber();
	}
	
	public void inicializar(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public MapSite getSide(Direction d) {
		return sides.get(d);
	}
	
	public void setSide(Direction d, MapSite mapSite) {
		sides.put(d, mapSite);
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public void enter() {
	}

	@Override
	public Room clonar() {
		return new Room(this);
	}

}
