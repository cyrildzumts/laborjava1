package aufgabenblatt3;

import java.util.Scanner;


/*********************************************************
 * @version 1.0
 * Semester 1, SS15
 * Praktikum 1.
 * Aufgabenblatt 3, NabelBaum
 * Technische Informatik
 * HAW HAMBURG
 * Prof : Philipp Jenke
 * @author Cyrille Ngassam Nkwenga
 * EMAIL : Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * 
 * Description : Dieses Programm zeichnet ein Dreieck-Baum in der
 * Konsole
 */

public class NabelBaum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines = 0;
		int colomn = 0;
		int pivot = 0;
		Scanner eingabe = new Scanner(System.in);
		System.out
				.println(" Geben Sie ei die Anzahl von Zeilen des Nabelbaumes ein");
		lines = eingabe.nextInt();
		eingabe.close();
		colomn = (2 * lines) - 1;
		pivot = lines - 1;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < colomn; j++) {
				if ((j >= (pivot - i)) && ((j <= (pivot + i)))) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}

			}
			System.out.print("\n");
		}

	}

}
