import se.lth.cs.pt.window.*;
import se.lth.cs.pt.maze.*;

public class MazeWalker {
	private Turtle turtle;

	public MazeWalker(Turtle turtle) {
		this.turtle = turtle;
	}

	public void walk(Maze maze) {
		int steps = 0;
		int turns = 0;
		turtle.penDown();
		while (!maze.atExit(turtle.getX(), turtle.getY())) {

			if (!maze.wallAtLeft(turtle.getDirection(), turtle.getX(), turtle.getY())) {
				turtle.left(90);
				turtle.forward(1);
				steps++;
				turns++;
			} else if (!maze.wallInFront(turtle.getDirection(), turtle.getX(), turtle.getY())) {
				turtle.forward(1);
				steps++;
			}

			else {
				turtle.left(270);
				turns++;
			}
			SimpleWindow.delay(1);
		}
		System.out.println("Turtle gick " + steps + " steg och sv�ngde " + turns + " g�nger.");

	}
}
