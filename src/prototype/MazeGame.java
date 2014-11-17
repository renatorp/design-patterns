package prototype;

import prototype.Room.Direction;

public class MazeGame {
	
	public static void main(String[] args) {
		MazePrototypeFactory factory = new MazePrototypeFactory(new Maze(), new Door(), new Room(), new Wall());
		Maze maze = createMaze(factory);
		Maze maze2 = createMaze(new MazePrototypeFactory(new Maze(), new Door(), new Room(), new BombedWall()));
		
		System.out.println(getStringWall(maze));
		System.out.println(getStringWall(maze2));
	}

	private static Maze createMaze(MazePrototypeFactory factory) {
		Maze maze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door door = factory.makeDoor(r1, r2);
		
		maze.addRoom(r1);
		maze.addRoom(r2);
		
		r1.setSide(Direction.NORTH, factory.makeWall());
		r1.setSide(Direction.EAST, door);
		r1.setSide(Direction.SOUTH, factory.makeWall());
		r1.setSide(Direction.WEST, factory.makeWall());
		
		return maze;
	}
	
	private static String getStringWall(Maze maze) {
		return maze.getRooms().get(0).getSide(Direction.NORTH).toString();
	}
	
}
