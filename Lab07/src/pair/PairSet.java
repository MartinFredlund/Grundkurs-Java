package pair;

import java.util.Random;

public class PairSet {
	private int n;
	private Pair[] pairs;
	private static Random rand = new Random();

	/**
	 * Skapar en mängd av alla talpar (a,b) sådana att 0 <= a < rows och 0 <= b <
	 * cols
	 */
	public PairSet(int rows, int cols) {
		n = rows * cols;
		pairs = new Pair[n];
		for (int k = 0; k < n; k++) {
			pairs[k] = (new Pair(rand.nextInt(4), rand.nextInt(13)));
		}

	}

	/** Undersöker om det finns fler par i mängden. */
	public boolean more() {
		if(n > 0)
		{
			return true;
		}
		return false;
	}

	/**
	 * Hämtar ett slumpmässigt valt talpar ur mängden. Mängden blir ett element
	 * mindre. Om mängden är tom returneras null.
	 */
	public Pair pick() {
		if (n != 0) {
			int temp = rand.nextInt(n);
			Pair tempCard = pairs[temp];
			pairs[temp]= pairs[n-1];
			pairs[n-1]=null;
			n--;
			return tempCard;
		} else {
			return null;
		}
	}
}
