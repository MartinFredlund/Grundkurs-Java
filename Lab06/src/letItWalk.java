import se.lth.cs.pt.window.*;

import java.util.Scanner;

import se.lth.cs.pt.maze.*;

public class letItWalk {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("V�lj karta genom att skriva ett tal mellan 1-5");
		Maze maze = new Maze(scan.nextInt());
		SimpleWindow w = new SimpleWindow(400, 400, "Maze");
		Turtle turtle = new Turtle(w, maze.getXEntry(), maze.getYEntry());
		MazeWalker m = new MazeWalker(turtle);
		maze.draw(w);
		m.walk(maze);
		
	}
}
