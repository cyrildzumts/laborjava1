package aufgabenblatt3;
/*********************************************************
 * @version 1.0
 * Semester 1, SS15
 * Praktikum 1.
 * Aufgabenblatt 3, Ausdrücke
 * Technische Informatik
 * HAW HAMBURG
 * Prof : Philipp Jenke
 * @author Cyrille Ngassam Nkwenga
 * EMAIL : Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * 
 * Description : Dieses Programm prüft die Ausdrücke und liefert
 * das Ergebnis in die Konsole
 */
public class Ausdruck 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double radius = 0.5;
		double seitenLaenge = 1.0;
		
		double zahl = 15.45;
		double ersteZahl = 9.5;
		double zweiteZahl = 11.18;
		
		boolean markiert = true;
		boolean ausdruckA;
		boolean ausdruckB;
		boolean ausdruckC;
		//double epsilon = 2*radius*Math.PI - 1.5;
		/* a:
		 * Der Umfang des Kreises mit Radius radius ist größer als 1.5 und der Flächeninhalt des Quadrats
		   mit Seitenlänge seitenlaenge ist kleiner als 0.5.
		 */
		
		
		// man muss eigentlich Math.abs() nutzen und epsilon vergleichen .
		ausdruckA = (((2*radius*Math.PI)  > 1.5) && Math.pow(seitenLaenge,2) < 0.5);
		System.out.println("Ausdruck A ist " + ausdruckA);
		
		/***************************************************
		 * b) Das Flag (http://de.wikipedia.org/wiki/Flag_%28Informatik%29) markiert ist entweder wahr oder
		 * der ganzzahlige Anteil der Fließkommazahl zahl ist ungleich 15.
		 */
		ausdruckB = markiert ^ ((int)zahl != 15);
		//markiert = (int)zahl != 15 ? true :false;
		System.out.println("Ausdruck B ist " + ausdruckB);
		
		/***************************************************
		 * 
		 * c) Die Fließkommazahl ersteZahl ist kleiner oder gleich 1.5 und die Fließkommazahl zweiteZahl
		 * ist größer oder gleich 3.2 und die erste Zahl ist genauso groß wie die zweite Zahl.
		 * 
		 */
		
		ausdruckC = (ersteZahl <= 1.5 && zweiteZahl >= 3.2 && ersteZahl == zweiteZahl);
		System.out.println("Ausdruck C ist " + ausdruckC);
	}

}
