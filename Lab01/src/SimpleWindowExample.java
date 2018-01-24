import java.awt.Color;

import se.lth.cs.pt.window.SimpleWindow;

public class SimpleWindowExample {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500,500, "Drawing Window");
		w.setLineColor(Color.blue);
		w.setLineWidth(10);
		w.moveTo(100, 100);
		w.lineTo(150, 100);
		w.moveTo(150, 95);
		w.lineTo(150, 150);
		w.moveTo(155, 150);
		w.lineTo(95, 150);
		w.moveTo(100, 150);
		w.lineTo(100, 95);
		
	}
}
