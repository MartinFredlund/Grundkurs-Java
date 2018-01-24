import java.util.Random;
import java.util.Scanner;

public class Metoder {
	Scanner scan = new Scanner(System.in);

	public void StartaSpelet() {
		System.out.println("*** STEN SAX PÅSE *** \nSpelet är Best of 3 \nGör ditt val genom att skriva Sten/Sax/Påse");

	}

	public int NästaVal() {
		int SpelareVal = -1;
		while (SpelareVal == -1) {
			String val = scan.next();

			if (val.equalsIgnoreCase("Sten")) {
				SpelareVal = 0;
			} else if (val.equalsIgnoreCase("sax")) {
				SpelareVal = 1;
			} else if (val.equalsIgnoreCase("påse")) {
				SpelareVal = 2;
			} else {

				System.out.println("Fel vid inmatning. \nFörsök igen :)");
				SpelareVal = -1;
			}
		}
		return SpelareVal;

	}

	public int DatornsVal() {
		Random tal = new Random();
		return tal.nextInt(3);

	}

	public int Vinnare(int DatornsVal, int SpelarensVal) {
		DatornsVärde(DatornsVal);
		if (SpelarensVal + 1 == DatornsVal || SpelarensVal - 2 == DatornsVal) {
			return 0;
		} else if (DatornsVal == SpelarensVal) {
			return 1;
		} else if (DatornsVal + 1 == SpelarensVal || DatornsVal - 2 == SpelarensVal) {
			return 2;
		} else {
			return -1;
		}
	}

	public void Resultat(int spelarePoäng, int likaPoäng, int datornPoäng) {
		System.out.println(
				"*****RESULTAT***** \nSpelare: " + spelarePoäng + " Lika: " + likaPoäng + " Datorn: " + datornPoäng);
	}

	public void DatornsVärde(int tal) {
		switch (tal) {
		case 0:
			System.out.println("Datorn valde Sten");
			break;
		case 1:
			System.out.println("Datorn valde Sax");
			break;
		case 2:
			System.out.println("Datorn valde Påse");
		}
	}
}
