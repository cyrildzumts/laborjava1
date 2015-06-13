package aufgabenblatt4;

//import aufgabenblatt4.Wagen;
/**
 * @literal Description : Diese Klasse stellt eine Lokomotive dar. Der erste
 *          Wagen haengt direkt an der Lokomotive. Semester 1, SS15 Praktikum
 *          Aufgabenblatt 4, Eisenbahn Technische Informatik HAW HAMBURG Prof :
 *          Philipp Jenke
 * @author Cyrille Ngassam Nkwenga EMAIL :
 *         Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * @author Theophile Teyou Soh
 *		   Theophile.TeyouSoh@haw-hamburg.de
 * @version 1.0
 */

public class Lokomotive {

	/**
	 * Die Laenge des Wagens
	 */
	private final int laenge;

	/**
	 * Der Typ der Lokomotive
	 */
	private final int typ;

	/**
	 * Der erste Wagen der Lokomotive, wenn es einen gibt, sonst wird auf null
	 * gesetzt
	 */
	private Wagen ersteWagen;

	/**
	 * Diese Method liefert die laenge der Lokomotive zurueck
	 * 
	 * @return laenge als die Laenge der Lokomotive
	 */
	public int getLaenge() {
		return laenge;
	}

	/**
	 * Diese Method liefert der Typ der Lokomotive zurueck
	 * 
	 * @return typ als der Typ der Lokomotive
	 */
	public int getTyp() {
		return typ;
	}

	/**
	 * Diese Method liefert den ersten Wagen zurueck, wenn es einen gibt, sonst
	 * null wird zurueck geliefert
	 * 
	 * @return ersteWagen
	 */
	public Wagen getErsteWagen() {
		return ersteWagen;
	}

	/**
	 * Diese Method setzt wagen als der erste Wagen
	 * 
	 * @param wagen
	 *            Der erste Wagen
	 */
	public void setErsteWagen(Wagen wagen) {
		ersteWagen = wagen;
	}

	/**
	 * Diese Method entfernt den ersten Wagen des Zuges. Danach wird alle
	 * weitere Wagen nach vorn geschoben. Nach der Entfernung liefert diese
	 * Method den entfernte Wagen zurueck. Wenn ersteWagen null ist, dann
	 * liefert diese Methode auch null
	 * 
	 * @return ersteWagen Der entfernte Wagen
	 */
	public Wagen ersteWagenEntfernen() {
		if (ersteWagen != null) {
			Wagen entfernteWagen = ersteWagen;
			entfernteWagen.setNaechsteWagen(null);
			ersteWagen = ersteWagen.getNaechsteWagen();
			return entfernteWagen;
		} 
		else {
			return null;
		}
	}

	/**
	 * Diese Method haengt einen neuen Wagen "wagen" an die Lokomotive an.
	 * 
	 * @param wagen
	 *            Der hinzufuegene Wagen
	 */

	public void wagenHinzufuegen(Wagen wagen) {
		if (wagen != null) {
			if (ersteWagen == null)
				setErsteWagen(wagen);
			else {
				Wagen endeWagen = ersteWagen;
				Wagen tmp = new Wagen();
				while (endeWagen != null) {
					tmp = endeWagen;
					endeWagen = endeWagen.getNaechsteWagen();
				}
				tmp.setNaechsteWagen(wagen);
			}
		}

	}

	/**
	 * Diese Method entfernt alle Wagen die an diese Lokomotive haengen
	 */

	public void allWagenEntfernen() {
		setErsteWagen(null);
	}

	/**
	 * Default Konstruktor Dieses Konstruktor herstellt eine Lokomotive ohne
	 * wagen.
	 */
	public Lokomotive() {
		laenge = 15;
		typ = 3;
		ersteWagen = null;
	}

	/**
	 * Zweite Konstrukor Dieses Konstruktor herstellt eine Lokomotive mit wagen
	 * als der erste Wagen
	 * 
	 * @param wagen
	 */
	public Lokomotive(Wagen wagen) {
		this();
		ersteWagen = wagen;
	}
}
