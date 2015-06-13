package aufgabenblatt4;
import aufgabenblatt4.Lokomotive;
import aufgabenblatt4.Wagen;


/**
 * Description : Die Klasse Zug repraesentiert den ganzen Zug. Ein Zug-Objekt kennt
 * "seine" Lokomotive (Objektvariable lok), aber nicht die Wagen.
 * @version 1.0
 * Semester 1, SS15
 * Praktikum 
 * Aufgabenblatt 4, Eisenbahn
 * Technische Informatik
 * HAW HAMBURG
 * Prof : Philipp Jenke
 * @author Cyrille Ngassam Nkwenga
 * @literal
 * EMAIL : Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * @author Theophile Teyou Soh
 * EMAIL : Theophile.TeyouSoh@haw-hamburg.de
 */
public class Zug {
	
	/**
	 * Anzahl von Zuege die schon produziert sind
	 */
	public static int zugnummer = 1;
	
	/**
	 * Seriennummer dieses Zuges
	 */
	private int seriennummer;
	
	/**
	 * Die Lokomotive dieses Zuges
	 */
	private Lokomotive lok;
	
	/**
	 * Die Anzahl von Wagen die dieser Zug besitzt
	 */
	private int wagenAnzahl;
	
	/**
	 * Die Gesamtekapazitaet dieses Zuges. Das ist, die Summe der Kapazitaet
	 * allen Wagen dieses Zuges
	 */
	private int kapazitaet;
	
	/**
	 * Die Gesamtelaenge dieses Zuges. Das ist, die Summe der Laenge
	 * allen Wagen dieses Zuges
	 */
	private int laenge;
	
	/**
	 *  eigenschaftenUpdate aktualisiert die Parameter der Klasse
	 */
	private void eigenschaftenUpdate()
	{
			laenge = 0;
			kapazitaet = 0;
			wagenAnzahl = 0;
			if(lok != null){
				Wagen endeWagen = lok.getErsteWagen();
				while(endeWagen!= null)
				{
					laenge += endeWagen.getLaenge();
					kapazitaet += endeWagen.getKapazitaet();
					wagenAnzahl ++;
					endeWagen = endeWagen.getNaechsteWagen();
				}
			}
			else System.out.println("Sie müssen erstmal eine Lokomotive hinfügen");
	}

	/**
	 * Diese Method liefert die Lokomotive des Zuges zurueck
	 * @return lok 
	 */
	
	public Lokomotive getLok() {
		return lok;
	}

	/**
	 * Diese Method setzt lok  als die Lokomotive 
	 * des Zuges
	 * @param lok
	 */
	public void setLok(Lokomotive lok) {
		this.lok = lok;
	}
	
	/**
	 * Diese Method fuegt einen neuen Wagen "wagen" an dem 
	 * Zug zu und aktualisert die Anzahl der Wagen in 
	 * diesem Zug ohne die Lokomotive.
	 * @param wagen Der hinzufuegene Wagen
	 */
	public void wagenHinzufuegen(Wagen wagen)
	{
		if(lok != null){
			lok.wagenHinzufuegen(wagen);
			eigenschaftenUpdate();
		}
		else System.out.println("Sie müssen erstmal eine Lokomotive hinfügen");
	}
	
	/**
	 * Diese Method entfernt den ersten Wagen des Zuges.
	 * Danach wird alle weitere Wagen nach vorn geschoben.
	 * Nach der Entfernung liefert diese Method den entfernte Wagen
	 * zurueck.
	 * @return ersteWagen Der entfernte Wagen
	 */
	public Wagen ersteWagenEntfernen()
	{ 
		if(lok != null){
			laenge -= lok.getErsteWagen().getLaenge();
			kapazitaet -= lok.getErsteWagen().getKapazitaet();
			wagenAnzahl --;
			return lok.ersteWagenEntfernen();
		}

		else {
			System.out.println("Sie müssen erstmal eine Lokomotive hinfügen");
			return null;
		}
//		Wagen entfernteWagen = lok.getErsteWagen();
//		lok.setErsteWagen(entfernteWagen.getNaechsteWagen());
//		entfernteWagen.setNaechsteWagen(null);
//		eigenschaftenUpdate();
//		return entfernteWagen;
	}
	
	/**
	 * Diese Method haengt alle Wagen von "zug" in der gleichen
	 * Reihenfolge an diesen Zug an.  In "zug" bleibt nur die Lokomotive
	 * zurueck. Nach dieser dieser Method werden alle Eigenschaften dieses Zuges aktualisiert
	 * @param zug
	 */
	public void zugAnhaengen(Zug zug)
	{
		/*********************************************
		 * Erstmal wir pruefen ob die Lokomotive dieses
		 * Zuges und der Parameter zug gueltig sind.
		 * Wenn ja fuehren die operation aus, sonst tun
		 * wir nichts
		 */
		if(lok!= null){
			if( zug !=null && zug.getLok() != null){
				wagenHinzufuegen(zug.getLok().getErsteWagen());
				zug.getLok().setErsteWagen(null);
			}
		}
		
		else System.out.println("Sie müssen erstmal eine Lokomotive hinfügen");
		
	}
	
	/**
	 * Diese Method liefert die Anzahl der Wagen in 
	 * diesem Zug ohne die Lokomotive
	 * @return wagenAnzhal Die Anzahl der Wagen in 
	 * diesem Zug ohne die Lokomotive
	 */
	public int getWagenAnzahl()
	{
		return wagenAnzahl;
	}
	
	/**
	 * Diese Method liefert die gesamte Passagierkapazitaet dieses
	 * Zuges.
	 * @return kapazitaet Die gesamte Passagierkapazitaet dieses
	 * Zuges.
	 */
	public int getKapazitaet()
	{
		return kapazitaet;
	}
	
	/**
	 * Diese Method liefert die Gesamtlaenge dieses
	 * Zuges : Lokomotive + Wagen
	 * @return Die Gesamtlaenge dieses
	 * Zuges : Lokomotive + Wagen
	 */
	public int getLaenge()
	{
		return laenge;
	}
	
	/**
	 * @deprecated @see toString() Method
	 * Diese Method gibt eine Beschreibung dieses Zuges mit allen 
	 * Bestandteilen (Typ der Lok, Anzahl Wagen, Gesamtlaenge, 
	 * gesamte Passagierkapazitaet sowie für jeden Wagen Seriennummer,
	 * Wagenlaenge und Passagierkapazitaet ) auf der Konsole aus.
	 */
	public void info ()
	{
		eigenschaftenUpdate();
		System.out.println("************************************************************");
		System.out.format("***************** Beschreibung des Zuges %d *****************\n", seriennummer);
		System.out.format("Typ der Lokomotive       : %d\n", lok.getTyp());
		System.out.format("Anzahl Wagen             : %d\n", wagenAnzahl);
		System.out.format("Gesamtelänge des Zuges   : %d\n", laenge);
		System.out.format("Passagierkapazität       : %d\n", kapazitaet);
		System.out.println("-----------------     Wagen Info  --------------------------");
		System.out.println("  Seriennummer      Wagenlänge 		Passagierkapazität ");
		Wagen wagen = lok.getErsteWagen();
		while(wagen != null)
		{
			System.out.format(" \t%d  \t\t %d   \t\t\t %d\n", wagen.getSerienNummer(),wagen.getLaenge(), wagen.getKapazitaet());
			wagen = wagen.getNaechsteWagen();
		}	
		System.out.println("-----------------------------------------------------------");

	}
	
	/**
	 * toString  liefert die Eigenschaften des Objektes zurueck und ermoeglicht uns ein Zug-
	 * Object an System.out.print anzuweisen
	 */
	
	public String toString()
	{
		String zugInfo = "";
		if(lok != null){
			eigenschaftenUpdate();
			zugInfo += String.format("************************************************************\n");
			zugInfo += String.format("***************** Beschreibung des Zuges %d ****************\n", seriennummer);
			zugInfo += String.format("Typ der Lokomotive       : %d\n", lok.getTyp());
			zugInfo += String.format("Anzahl Wagen             : %d\n", wagenAnzahl);
			zugInfo += String.format("Gesamtelänge des Zuges   : %d\n", laenge);
			zugInfo += String.format("Passagierkapazität       : %d\n", kapazitaet);
			zugInfo += String.format("-----------------     Wagen Info  --------------------------\n");
			zugInfo += String.format("  Seriennummer      Wagenlänge 		Passagierkapazität \n");
			Wagen wagen = lok.getErsteWagen();
			while(wagen != null)
			{
				zugInfo += String.format("\t%d  \t\t %d   \t\t\t %d\n", wagen.getSerienNummer(),wagen.getLaenge(), wagen.getKapazitaet());
				wagen = wagen.getNaechsteWagen();
			}	
			zugInfo += String.format("-----------------------------------------------------------\n");
			return zugInfo;
		}
		
		else{
			 //System.out.println("Sie müssen erstmal eine Lokomotive hinfügen");
			 return zugInfo;
		}
		
		
	}
	
	/**
	 * Default Konstruktor. 
	 * Das Konstruktor stellt einen Zug mit einer Lokomotive her.
	 */
	public Zug()
	{
		
		seriennummer = zugnummer++;
		lok = new Lokomotive();
		wagenAnzahl = 0;
		kapazitaet = 0;
		laenge = 0;
	}
	
	/**
	 * Konstruktor. 
	 * Das Konstruktor stellt einen Zug mit lok als die Lokomotive her.
	 */
	public Zug(Lokomotive lok)
	{
		this();
		if(lok != null)
			this.lok = lok;
	}
	
	/**
	 * Konstruktor. 
	 * Das Konstruktor stellt einen Zug mit wagen als der erste Wagen der
	 * Lokomotive des Zuges..
	 */
	public Zug(Wagen wagen)
	{
		seriennummer = zugnummer++;
		wagenAnzahl = 1;
		kapazitaet = wagen.getKapazitaet();
		laenge = wagen.getLaenge();
		lok = new Lokomotive(wagen);	
	}

}
