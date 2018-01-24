package pair;

public class Patiensen {
	private static final double NBR_ITERATIONS = 1000000.00000;

	public static void main(String[] args) {
		
		double tempAmount = 1000000;
		int lost = 0;
		while (tempAmount > 0) {
			int temp = 0;
			PairSet cardDeck = new PairSet(4, 13);
			while (cardDeck.more()) {

				if (temp == 3) {
					temp = 0;

				}

				if (cardDeck.pick().second() == temp) {
					temp++;

					lost++;
					
					break;
				} else {
					temp++;
					

				}
			}
			tempAmount--;
			System.out.println(1-lost / NBR_ITERATIONS);
		}

	}
}
