
public class Mole {
	static Graphics g = new Graphics(30, 50, 10);
	java.awt.Color c;

	public static void main(String[] args) {
		Mole m = new Mole();
		m.drawWorld();
		

		m.dig();

	}

	public void drawWorld() {
		g.rectangle(0, 0, g.getWidth(), 3, Colors.SKY);
		g.rectangle(0, 3, g.getWidth(), 5, Colors.GRASS);
		g.rectangle(0, 5, g.getWidth(), g.getHeight(), Colors.SOIL);
	}

	public void dig() {
		int x = g.getWidth() / 2; // För att börja på mitten
		int y = g.getHeight() / 2;
		while (true) {
			g.block(checkx(x), checky(y), Colors.MOLE);
			char key = g.waitForKey();
			if (y <= 4) {
				c = Colors.GRASS;
			} else {
				c = Colors.TUNNEL;
			}

			g.block(checkx(x), checky(y), c);

			if (key == 'w') {
				y--;
			} else if (key == 'a') {
				x--;
			} else if (key == 's') {
				y++;
			} else if (key == 'd') {
				x++;
			}

		}
	}

	public int checkx(int x) {

		if (x > 29) {
			x = 29;
		}
		if (x < 0) {
			x = 0;
		}

		return x;
	}

	public int checky(int y) {
		if (y > 49) {
			y = 49;
		}
		if (y < 3) {
			y = 3;
		}
		return y;
	}
}
