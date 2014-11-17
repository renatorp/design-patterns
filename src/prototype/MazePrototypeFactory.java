package prototype;

public class MazePrototypeFactory {

	private Maze maze;
	private Door door;
	private Room room;
	private Wall wall;

	/**
	 * Precisa ter o construtor para que seja possível utilizar o factory para fabricar
	 * maze's com subclasses de door, room, etc.
	 */
	public MazePrototypeFactory(Maze maze, Door door, Room room, Wall wall) {
		this.maze = maze;
		this.door = door;
		this.room = room;
		this.wall = wall;
	}
	
	public Maze makeMaze() {
		return maze.clonar();
	}
	
	public Door makeDoor(Room r1, Room r2) {
		Door door = this.door.clonar();
		door.inicializar(r1, r2);
		return door;
	}
	
	public Room makeRoom(int roomNumber) {
		Room room = this.room.clonar();
		room.inicializar(roomNumber);
		return room;
	}
	
	public Wall makeWall() {
		return wall.clonar();
	}
	
	
}
