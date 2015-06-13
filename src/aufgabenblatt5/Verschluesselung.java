package aufgabenblatt5;

/**
 * Diese Klasse 
 * Semester 1, SS15 Praktikum
 * Aufgabenblatt 5, Verschluesselung 
 * Technische Informatik HAW HAMBURG 
 * Prof :Philipp Jenke
 * 
 * @author Cyrille Ngassam Nkwenga EMAIL :
 * @author Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * @author Theophile Teyou Soh 
 * @author Theophile.TeyouSoh@haw-hamburg.de
 * @version 1.0
 */
public class Verschluesselung {
	

	/**
	 * Der Schlussel mit dem wir den Text verschlusseln
	 */
	private final int key;
	
	/**
	 * Default Konstructor : Der Schlussel wir auf einen default
	 * Wert gesetzt : hier 4
	 */
	Verschluesselung(){
		key = 4;
	}
	
	/**
	 * Ueberladenes Konstruktor
	 * @param key ist der Schlussel mit dem wir
	 * den Text verschlusseln wollen
	 */
	Verschluesselung(int key){
		this.key = key;
	}
	
	/**
	 * Diese Methode nimmt einen normalen Text als Paramater
	 * und liefert den verschlusselene Text zurueck
	 * @param text ist der zuverschlusselene Text
	 * @return verschlusselteText, der verschlusselene Text
	 */
	public String verschluesseln(String text){
		char ch;
		String verschlusselteText = "";
		for (int index = 0; index < text.length(); index++){
			ch = text.toUpperCase().charAt(index);
			if(ch + key  <= 'Z'){
				verschlusselteText += String.format("%c", ch + key);
			}
			else {
				verschlusselteText += String.format("%c", ch + key + ('A' - 'Z') - 1);
			}
		}
		
		return verschlusselteText;
		
	}
	
	/**
	 * Diese Methode nimmt einen verschlusselene Text als Paramater
	 * und liefert den entschlusselene Text zurueck
	 * @param text ist der zuentschlusselene Text
	 * @return entschlusselteText, der entschlusselene Text
	 */
	public String entschluesseln(String text){
		char ch;
		String entschlusselteText = "";
		for (int index = 0; index < text.length(); index++){
			ch = text.toUpperCase().charAt(index);
			if(ch - key  >= 'A'){
				entschlusselteText += String.format("%c", ch - key);
			}
			else {
				entschlusselteText += String.format("%c", ch - key + ('Z' - 'A') + 1);
			}
		}
		return entschlusselteText;
	}
}
