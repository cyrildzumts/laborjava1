package aufgabenblatt3;
/*********************************************************
 * Semester 1, SS15
 * Praktikum 1.
 * Aufgabenblatt 3, Programm Primfaktoren
 * Technische Informatik
 * HAW HAMBURG
 * Prof : Philipp Jenke
 * @author Theophile Teyou Soh. 
 * EMAIL : Theophile.TeyouSoh@haw-hamburg.de
 *
 * @author Cyrille Ngassam Nkwenga 
 * EMAIL : Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * 
 * Description : Dieses Programm Berechnet die 
 * Primfaktorzerlegung für eine eingegebene positive 
 * ganze Zahl  n ( n > 1 ) und gibt eine Darstellung von n
 * als Produkt von Primzahlen aus.
 *
 */

import java.util.Scanner;

class PrimFaktoktoren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int zahl;
		Scanner eingabe = new Scanner (System.in);
		System.out.println("Die Darstellung von einer Zahl als Produkt von Primzahlen !");
		System.out.println("Bitte geben sie eine Zahl ( n > 1 ) ein :");
		zahl = eingabe.nextInt();
		eingabe.close();
		
		if ( zahl <= 1) {
			System.out.println("die eingegebene ganze Zahl nuss groesser als 1 sein");	
		}
		
		else {
			System.out.print("  Primfaktoren von " + zahl + " ist : ");
			/**********************************************
			 * Wenn wir einen Teiler finden , der ein Faktor 
			 * von Zahl ist, dann ist zahl kein Primezahl.
			 * Und nur wenn Zahl kein Primezahl ist  können
			 * wir mit der Zerlegung anfangen. Das letzte 
			 * Faktor steht in zahl. Das brauchen wir nur 
			 * anzuzeigen.
			*/
			for ( int teiler = 2; teiler < zahl; teiler++ ){
				while (zahl % teiler == 0){
					System.out.print( teiler + " ");
					zahl = zahl / teiler ;	
					}	
				}
				System.out.print( zahl);
		}			
	}	
}