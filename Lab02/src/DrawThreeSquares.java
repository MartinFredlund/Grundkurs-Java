import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class DrawThreeSquares {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
//		Square sq = null;
		Square sq = new Square(50, 50, 100);
		for(int x = 0; x < 3; x++) {
		sq.move(25*x, 15*x);
		sq.draw(w);
		}
	}
}
