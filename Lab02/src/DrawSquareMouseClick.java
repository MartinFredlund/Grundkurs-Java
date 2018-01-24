import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class DrawSquareMouseClick {
	public static void main(String[] args) {
	SimpleWindow w = new SimpleWindow(600, 600, "DrawSquareMouseClick");
	int oldX = 0;
	int oldY = 0;
			
	while (true)
	{
		
		w.waitForMouseClick();
		w.clear();
		int x = w.getMouseX();
		int y = w.getMouseY();
		int distsX = oldX - x;
		int distsY = oldY - y;			
		for(int i = 0; i < 10; i++) {
			Square sq = new Square(oldX - (distsX/10), oldY - (distsY/10), 100);
			sq.draw(w);
			oldX = oldX - distsX/10;
			oldY = oldY - distsY/10;
		}
		oldX = x;
		oldY = y;
	}
}
}

