package aufgabenblatt5;
/**
 * 
 * @author cyrildz
 *
 */
public class Palindrom {
	/**
	 * Diese Methode ueberprueft ob ein String ein Palindrom ist.
	 * 
	 * @param text ist was wir ueberpruefen wollen
	 * @return wahr wenn text ein Palindrom ist sonst 
	 * liefert falsch  zurueck.
	 */
	public static boolean isPalindrom(String text){
		//text = text.toLowerCase();
		for(int i = 0,j = text.length()-1 ; j >= i; i++,j--){
			if(text.charAt(i) != text.charAt(j)){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Diese Methode sucht ein Palindrom in wort.
	 * Das laengste Palindrom wird zurueckgeliefert
	 * wenn es einen gibt, sonst wird ein Leerzeichen
	 * zurueckgeliefert.
	 * 
	 * In diesem Methode wird alle moeglichen String 
	 * Kombination geprueft. 
	 * Fuer jedes Buchstaben , von links, wird es passendes 
	 * Buchstabe rechts gesucht. wenn wir einen finden,
	 * erzeugen wird subString aus wort und ueberpruefen wir 
	 * ob es ein Palindrom ist. Das Verfahren wird wiederholt
	 * solange es noch eine Kombination gibt.
	 * @param wort 
	 * @return das laengste Palindrom
	 */
	public static String suchPalindrom(String wort){
		//wort = wort.toLowerCase();
		String laengstePal ="";
		if(Palindrom.isPalindrom(wort.toLowerCase())){
			return wort;
		}
		else 
		{
			for(int i = 0; i < wort.length(); i++){
				for(int j = wort.length()-1; j >i; j--){
					if(wort.charAt(i) == wort.charAt(j) && (j-i) > 1){
						String palind = wort.substring(i, j+1);
						//System.out.println(palind);
						if(Palindrom.isPalindrom(palind)){
							if(palind.length() > laengstePal.length()){
								laengstePal = palind;
							}
						}
							
					}
				}
			}
		}
		return laengstePal;
	}
	

}
