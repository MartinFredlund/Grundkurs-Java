import se.lth.cs.pt.window.SimpleWindow;

public class Turtle {
	boolean isPenDown = false;
	SimpleWindow w = null;
	double xVärde;
	double yVärde;
	double alpha = (Math.PI)/2;
	/**
	 * Skapar en sköldpadda som ritar i ritfönstret w. Från början befinner sig
	 * sköldpaddan i punkten x, y med pennan lyft och huvudet pekande rakt uppåt i
	 * fönstret (i negativ y-riktning).
	 */
	public Turtle(SimpleWindow w, int x, int y) {
		this.w = w;
		xVärde = x;
		yVärde = y;
		
	}

	/** Sänker pennan. */
	public void penDown() {
		isPenDown = true;
	}

	/** Lyfter pennan. */
	public void penUp() {
		isPenDown = false;
	}

	/** Går rakt framåt n pixlar i den riktning huvudet pekar. */
	public void forward(int n) {
		w.moveTo((int)Math.round(xVärde), (int) Math.round(yVärde));
		xVärde += n * Math.cos(alpha);
		yVärde -= n * Math.sin(alpha);
		if(isPenDown)
		{
			w.lineTo((int)(Math.round(xVärde)), (int) (Math.round(yVärde)));
		}
		else
		{
			
			w.moveTo((int)(Math.round(xVärde)), (int) (Math.round(yVärde)));
		}
	}
	
	/** Vrider beta grader åt vänster runt pennan. */
	public void left(int beta) {
		alpha += beta * ((Math.PI)/180);
		
	}

	/**
	 * Går till punkten newX, newY utan att rita. Pennans läge (sänkt eller lyft)
	 * och huvudets riktning påverkas inte.
	 */
	public void jumpTo(int newX, int newY) {
		w.moveTo(newX, newY);
		xVärde = newX;
		yVärde = newY;
	}

	/** Återställer huvudriktningen till den ursprungliga. */
	public void turnNorth() {
		alpha = (Math.PI)/2;
	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position. */
	public int getX() {
		return (int) Math.round(xVärde);
	}

	/** Tar reda på y-koordinaten för sköldpaddans aktuella position. */
	public int getY() {
		return (int) Math.round(yVärde);
	}

	/** Tar reda på sköldpaddans riktning, i grader från den positiva X-axeln. */
	public int getDirection() {
		return (int) Math.toDegrees(alpha);
	}
}