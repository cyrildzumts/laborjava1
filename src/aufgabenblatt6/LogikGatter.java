package aufgabenblatt6;

public abstract class LogikGatter {
	/**
	 * Erster Eingang des Gatters
	 */
	protected LogikGatter eingabe1;
	/**
	 * Zweiter Eingang des Gatters
	 */
	protected LogikGatter eingabe2;
	
	/**
	 * Typ des Gatters : UND, ODER, NEGATION, KONSTANTE
	 */
	protected GatterTyp typ;
	
	/**
	 * Die Eingaenge des Gatters wird auf den gleichen 
	 * Eingangswert gesetzt
	 * @param eingabe 
	 */
	public LogikGatter(LogikGatter eingabe){
		eingabe1 = eingabe;
		eingabe2 = eingabe;
	}
	
	/**
	 * 
	 * @param eingabe1
	 * @param eingabe2
	 */
	public LogikGatter(LogikGatter eingabe1,LogikGatter eingabe2){
		this.eingabe1 = eingabe1;
		this.eingabe2 = eingabe2;
	}
	
	/**
	 * Diese Methode liefert den Typ des Gatters zurueck
	 * @return typ
	 */
	public GatterTyp getGatterTyp(){
		return typ;
	}
	
	public String toString(){
		
		return String.format("%b", auswerten());
	}
	/**
	 * Werte  die logische Operation aus.
	 * @return das logische Ergebnis 
	 */
	public abstract boolean auswerten();
	
	/**
	 * Liefert die Anzahl den Eingaenge zurueck.
	 * @return
	 */
	public abstract int getAnzahlEingaenge();
	
	
}
