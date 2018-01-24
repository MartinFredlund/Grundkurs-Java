import java.util.Random;
import se.lth.cs.pt.window.SimpleWindow;

public class iWouldWalk {
public static void main (String[] args)
{
	SimpleWindow w = new SimpleWindow(600, 600, "iWouldWalk");
	Turtle t = new Turtle(w, 300, 300); 
	Random tal = new Random();
	t.penDown();
	int randomTal;
	int randomVinkel;
	for(int i = 0; i < 1000; i++)
	{
		w.delay(2);
		randomTal = tal.nextInt(10);
		t.forward(randomTal+1);
		randomVinkel = tal.nextInt(361);
		t.left(randomVinkel-180);
	}
}
}
