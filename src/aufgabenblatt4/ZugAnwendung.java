package aufgabenblatt4;
import aufgabenblatt4.Wagen;
import aufgabenblatt4.Lokomotive;
import aufgabenblatt4.Zug;


/**
 * Diese Anwendung stellt mehrere Züge zusammen und
 * verwendet/testet die Methoden
 * Semester 1, SS15
 * Praktikum 
 * Aufgabenblatt 4, Eisenbahn
 * Technische Informatik
 * HAW HAMBURG
 * Prof : Philipp Jenke
 * @author Cyrille Ngassam Nkwenga
 * EMAIL : Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * @author Theophile Teyou Soh
 * EMAIL : Theophile.TeyouSoh@haw-hamburg.de
 * @version 1.0
 */
public class ZugAnwendung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wagen wagen = new Wagen();
		Lokomotive lok = new Lokomotive();
		Lokomotive lok2 = new Lokomotive();
		lok.setErsteWagen(wagen);
		
		Zug zug = new Zug(lok);
		Zug zug2 = new Zug(lok2);
		
		zug.wagenHinzufuegen(new Wagen());
		zug.wagenHinzufuegen(new Wagen(50,50));
		zug.wagenHinzufuegen(new Wagen(60,60));
		System.out.println(zug);
		zug.setLok(null);
		
		zug2.wagenHinzufuegen(new Wagen(40,40));
		zug2.wagenHinzufuegen(new Wagen(30,30));
		
		System.out.println(zug2);
		
		zug.zugAnhaengen(zug2);
		System.out.println(zug);
		
		
		System.out.println(zug2);
		
		
		zug2.wagenHinzufuegen(new Wagen(10,10));
		System.out.println(zug2);
		
		
		Wagen entferntWagen = zug.ersteWagenEntfernen();
		System.out.println(zug);
		
		System.out.println("Entfernter Wagen : " + entferntWagen);
		if(entferntWagen != null)
			System.out.format(" \t%d  \t\t %d   \t\t\t %d\n", entferntWagen.getSerienNummer(),entferntWagen.getLaenge(), entferntWagen.getKapazitaet());

		zug2.wagenHinzufuegen(entferntWagen);
		System.out.println(zug2);
		zug.setLok(zug2.getLok());
		zug.wagenHinzufuegen(new Wagen(40,40));
		System.out.println(zug);
		System.out.println(zug2);

	}

}
