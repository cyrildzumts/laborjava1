package aufgabenblatt2;
/*********************************************************
 * Semester 1, SS15
 * Praktikum 1.
 * Aufgabenblatt 2, Satellitenzeit
 * Technische Informatik
 * HAW HAMBURG
 * Prof : Philipp Jenke
 * @author Cyrille Ngassam Nkwenga. 
 * EMAIL : Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * Description : Dieses Programm wandelt der eingegebene Sekundenbetrag
 * in dem Format : <d> Tage <h>:<m>:<s> um.
 *
 */
public class SatellitenZeit 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final int tagDauerInSek = 86400;
		final int stundeInSek = 3600;
		final int minInSek = 60;
		int sekunden = 911;
		
		int tag = 0, stunde = 0,min = 0, sek = 0;
		tag = sekunden / tagDauerInSek;
		sekunden = sekunden % tagDauerInSek;
		stunde = sekunden / stundeInSek;
        sekunden = sekunden % stundeInSek;
        min = sekunden / minInSek;
        sekunden = sekunden % minInSek;
        sek = sekunden;
        System.out.println(tag + " Tage " + stunde + " : " + min + " : " + sek);
		
	}

}
