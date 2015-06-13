package aufgabenblatt4;

/**
 * @literal 
 * Description : Diese Klasse stellt einen Zugwagen dar.
 * Sie weiß welcher Wagen hinter sich liegt, wenn es einen gibt.

 * Semester 1, SS15
 * Praktikum 
 * Aufgabenblatt 4, Eisenbahn
 * Technische Informatik
 * HAW HAMBURG
 * @literal 
 * Prof : Philipp Jenke
 * @author Cyrille Ngassam Nkwenga
 * @literal 
 * EMAIL : Cyrille.Ngassam.Nkwenga@haw-hamburg.de.
 * @author Theophile Teyou Soh
 * EMAIL : Theophile.TeyouSoh@haw-hamburg.de
 * @version 1.0
 */

public class Wagen {
	/**
	 * Die Anzahl von Wagen die schon produziert sind.
	 */
	public static int wagenZahl = 0;
	
	/**
	 * Die Seriennummer des Wagens
	 */
	
	private int serienNummer;
	/**
	 * Die Laenge des Wagens 
	 */
	private final int laenge;
	/**
	 * Die Anzahl von Passagieren dieser Wagen nehmen kann
	 */
	private final int kapazitaet;
	/**
	 * Der naechste Wagen, wenn es einen gibt, sonst wird auf null gesetzt
	 */
	private Wagen naechsteWagen;
	
	/**
	 * Diese Method liefert die Seriennummer des Wagens zurueck
	 * @return serienNummer Die Seriennummer dieses Wagen
	 */
	
	public int getSerienNummer()
	{
		return serienNummer;
	}
	/**
	 * Diese Method liefert die laenge des Wagen zurueck
	 * @return laenge Die Laenge des Wagens
	 */
	public int getLaenge()
	{
		return laenge;
	}
	
	/**
	 *  Diese Method liefert die Passagierkapazitaet des Wagens.
	 * @return kapazitaet
	 */
	public int getKapazitaet()
	{
		return kapazitaet;
	}
	
	/**
	 * Diese Method setzt den naechsten Wagen  des Zuges.
	 * @param wagen der naechste Wagen 
	 */
	public void setNaechsteWagen(Wagen wagen)
	{
		naechsteWagen = wagen;
	}
	
	/**
	 *  Diese Method liefert den naechsten Wagen zurueck, wenn
	 *  es einen gibt, sonst null wird zurueck geliefert.
	 * @return naechsteWagen Der naechste Wagen
	 */
	public Wagen getNaechsteWagen()
	{
		return naechsteWagen;
	}
	
	/**
	 * Diese Method setzt naechsteWagen auf null.
	 * Das ist das gleiche als rufen setNaechsteWagen(null)
	 */
	public void entferntNaechsteWagen()
	{
		naechsteWagen = null;
	}
	
	/**
	 * 
	 * @param passagierAnzahl Die Anzahl von Passagieren in dem Wagen
	 */
	
	public void passagierHinfuegen(int passagierAnzahl)
	{
		
	}
	
	/**
	 * Default Konstruktor : 
	 */
	public Wagen()
	{
		
		wagenZahl++;
		serienNummer = wagenZahl;
		laenge = 30;
		kapazitaet = 100;
		naechsteWagen = null;
	}
	
	/**
	 * ruft den Default Konstruktor und setzt wagen als naechste
	 * Wagen.
	 * @param wagen Der naechste Wagen
	 */
	public Wagen(Wagen wagen)
	{
		this();
		naechsteWagen = wagen;
	}
	
	
	/**
	 * Herstellt einen Wagen mit der Laenge wagenLaenge und der 
	 * Kapazitaet wagenKapazitaet.
	 * @param wagenLaenge Die laenge des Wagens
	 * @param wagenKapazitaet Die Kapazitaet des Wagens
	 */
	public Wagen(int wagenLaenge, int wagenKapazitaet)
	{
		wagenZahl++;
		serienNummer = wagenZahl;
		laenge = wagenLaenge;
		kapazitaet = wagenKapazitaet;
		naechsteWagen = null;
	}
}
