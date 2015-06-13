package aufgabenblatt3;

// Zeitobjekten um die Zeit zu messen
import java.time.Duration;
import java.time.Instant;

// Collections Object für eine bessere Behandlung von Zahlen
import java.util.*;

public class PrimFaktor {

	// Attributen
	private List<Integer> primeZahlen = new ArrayList<Integer>();
	private List<Integer> primeFaktoren = new ArrayList<Integer>();
	private int zahl;
	private int n;
	// Start und Ende messen die gebrauchte Zeit um die Primezahlen zu erzeugen
	private Instant start;
	private Instant ende;

	// methoden
	public void primeFaktorenAnzeigen() {
		System.out.printf("Die Primefaktoren von %d sind : ", zahl);
		for (int i : primeFaktoren) {
			System.out.printf(" %d", i);
		}
		System.out.println("\nDie Erzeugung von Primezahlen hat "
				+ Duration.between(start, ende).toMillis() + " ms gedauert");
	}

	public void zahlEinlesen() {
		System.out.println("Geben Sie ein Zahl ein : ");
		Scanner eingabe = new Scanner(System.in);
		zahl = eingabe.nextInt();
		eingabe.close();
		n = (int) Math.sqrt(zahl);
		primeZahlenErzeugen();
	}

	public void primeZahlenErzeugenSlower() {

	}

	void primeZahlenErzeugen() {
		System.out
				.println(" Debug : Erzeugung von Primezahlen hat begonnen ... ");
		for (int i = 2; i <= zahl; i++) {
			// _numbers.push_back(i);
			primeZahlen.add(i);

		}

		// System.out.println( " computing the prime numbers have started" );
		start = Instant.now();
		int i = 0;
		while( i < primeZahlen.size()) {
			int currentWert = primeZahlen.get(i);
			if (currentWert > n)
				break;
			else
				for (int k = currentWert; k <= zahl / currentWert; k++) {
					primeZahlen.remove(new Integer(currentWert * k));
//					System.out
//							.println("content of primeZahlen: " + primeZahlen);
				}
			i++;
		}

		ende = Instant.now();

		System.out.println(" computing the prime numbers have finished");
	}

	public void zahlInPrimeFaktorZerlegen() {
		int tmp = zahl;
		int i = 0;
		while (i < primeZahlen.size()) {
			if (primeZahlen.contains(tmp)) {
				primeFaktoren.add(tmp);
				break;
			} else {
				if ((tmp % primeZahlen.get(i)) == 0) {
					primeFaktoren.add(primeZahlen.get(i));

					tmp = tmp / primeZahlen.get(i);
					continue;
				}
				i++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimFaktor primeFaktor = new PrimFaktor();
		primeFaktor.zahlEinlesen();
		primeFaktor.zahlInPrimeFaktorZerlegen();
		primeFaktor.primeFaktorenAnzeigen();

	}

}
