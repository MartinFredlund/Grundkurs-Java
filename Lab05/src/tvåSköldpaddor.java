import java.util.Random;

import se.lth.cs.pt.window.SimpleWindow;

public class tvåSköldpaddor
{

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "iWouldWalk");
		Turtle t = new Turtle(w, 350, 350);
		Turtle d = new Turtle(w, 250, 250);
		Random tal = new Random();
		t.penDown();
		d.penDown();
		int xDist = Math.abs(d.getX() - t.getX());
		int yDist = Math.abs(d.getY() - t.getY());
		while (xDist >= 50 || yDist >= 50) {
			xDist = Math.abs(d.getX() - t.getX());
			yDist = Math.abs(d.getY() - t.getY());
			t.forward(tal.nextInt(10) + 1);
			t.left(tal.nextInt(361) - 180);
			d.forward(tal.nextInt(10) + 1);
			d.left(tal.nextInt(361) - 180);
			// w.delay(10);
		}
	}
}
