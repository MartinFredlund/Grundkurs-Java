public class StenSaxPÂse {
	static Metoder g = new Metoder();

	public static void main(String[] args) {
		g.StartaSpelet();
		int spelarePo‰ng = 0;
		int likaPo‰ng = 0;
		int datorPo‰ng = 0;

		while (spelarePo‰ng < 2 && datorPo‰ng < 2) {
			int spelareVal = -1;
			int datornsVal = -1;
			datornsVal = g.DatornsVal();
			spelareVal = g.N‰staVal();
			int vinnare = g.Vinnare(datornsVal, spelareVal);
			switch (vinnare) {
			case 0:
				spelarePo‰ng++;
				System.out.println("Grattis du vann denna rundan");
				g.Resultat(spelarePo‰ng, likaPo‰ng, datorPo‰ng);
				break;
			case 1:
				likaPo‰ng++;
				System.out.println("Det blev lika");
				g.Resultat(spelarePo‰ng, likaPo‰ng, datorPo‰ng);
				break;
			case 2:
				datorPo‰ng++;
				System.out.println("Datorn vann denna rundan");
				g.Resultat(spelarePo‰ng, likaPo‰ng, datorPo‰ng);
				break;
			case -1:
				break;
			}
		}
		if (spelarePo‰ng > datorPo‰ng) {
			System.out.println("GRATTIS DU VANN!!!");

		} else {
			System.out.println("Tyv√§rr datorn vann");
		}
	}
}