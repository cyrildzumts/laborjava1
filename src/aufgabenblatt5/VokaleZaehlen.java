/**
 * 
 */
package aufgabenblatt5;

/**
 * Diese Klasse zaehlt wieviele Vokale ein Text hat. Semester 1, SS15 Praktikum
 * Aufgabenblatt 5, VokaleZaehlen Technische Informatik HAW HAMBURG Prof :
 * Philipp Jenke
 * 
 * @author Cyrille Ngassam Nkwenga EMAIL :
 * @author Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * @author Theophile Teyou Soh 
 * @author Theophile.TeyouSoh@haw-hamburg.de
 * @version 1.0
 */
public class VokaleZaehlen {

	/**
	 * Die Anzahl von kleinen Vokalen
	 */
	private int kleinVokale;
	
	/**
	 * Die Anzahl von Grossen Vokalen
	 */
	private int grossVokale;

	VokaleZaehlen(){
		kleinVokale = 0;
		grossVokale = 0;
	}
	
	
	/**
	 * 
	 * @return kleinVokale
	 */
	public int kleinVokaleAnzahl() {
		return kleinVokale;
	}

	/**
	 * 
	 * @return grossVokale
	 */
	public int grossVokaleAnzahl() {
		return grossVokale;
	}

	/**
	 * Diese Methode zaehlt die Anzahl von Vokalen im Text.
	 * Es wird einen Unterschied zwischen klein - und gross-
	 * Buchstaben 
	 * @param text 
	 */
	public void zaehlVokale(String text) {
		kleinVokale = 0;
		grossVokale = 0;
		for (int index = 0; index < text.length(); index++) {
			switch(text.charAt(index)){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				kleinVokale++;
				break;
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				grossVokale++;
				break;
			}
		}
	}
	
	public String toString(){
		return String.format("Kleine Vokale : %d\nGrosse Vokale : %d\n",kleinVokale,grossVokale);
	}

}
