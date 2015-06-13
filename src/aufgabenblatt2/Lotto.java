package aufgabenblatt2;
/*********************************************************
 * Semester 1, SS15
 * Praktikum 1.
 * Aufgabenblatt 2, Lotto Programm
 * Technische Informatik
 * HAW HAMBURG
 * Prof : Philipp Jenke
 * @author Cyrille Ngassam Nkwenga. 
 * EMAIL : Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * 
 * Description : Dieses Programm liefert uns 6 zufalligen Zahlen
 * zwischen [MIN, MAX]. 
 * Mit Hilfe von Math.Random() bekommen wir erst eine beliebige Dezimalzahl
 * zwischen [0,1). Da wir aber eine Zahl zwischen [MIN , MAX] brauchen,
 * multiplizieren wir das Ergebnis von Math.random() mit der Abstand zwischen 
 * MAX und MIN. das Ergebnis wird dann in eine Natürliche Zahl konvertiert.
 *
 */

public class Lotto 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final int LOTTOZAHL = 6;
		final int MIN = 1, MAX = 49;
		System.out.println("Der Sechste ist :" );
		for(int i = 0; i < LOTTOZAHL ; i++)
		{
			System.out.print(MIN + (int)(Math.random() * ((MAX - MIN) + 1)) + " ");
		}

	}

}
