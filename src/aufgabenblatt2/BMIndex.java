package aufgabenblatt2;
import java.util.Scanner;


/*********************************************************
 * @version 1.0
 * Semester 1, SS15
 * Praktikum 1.
 * Aufgabenblatt 2, Body Mass Index
 * Technische Informatik
 * HAW HAMBURG
 * Prof : Philipp Jenke
 * @author Cyrille Ngassam Nkwenga
 * EMAIL : Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * 
 * Description : Dieses Programm berechnet den Body Mass Index.
 * Der Benutzer gibt die Körpergroße und das Körpergewicht ein und
 * danach wird der entsprechende BMI als Dezimalzahl angezeigt.
 * 
 *
 */

public class BMIndex 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		float BMI = 0.0f;
		int BMIInt;
		float koerperGewicht = 0.0f,koerperGrosse = 0.0f;
		int isGrosseNull = 0; // Wird benutzt um die Große gegen null zu vergleichen
		// eingabe is used here to read the input from the console.
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Wir wollen der Body Mass Index berechnen.");
		System.out.println("Geben Sie bitte erst die Körpergroße(in Mettern) ein: ");
		koerperGrosse = eingabe.nextFloat();
		System.out.println("jetzt Geben Sie bitte das Körpergewicht(in Kilogramm) ein: ");
		koerperGewicht = eingabe.nextFloat();
		eingabe.close();
		isGrosseNull = Float.compare(koerperGrosse, 0.0f);
		// Man darf nicht ein Wert durch Null teilen, sonst kommt die Welt zu Ende hier an der HAW 
		if(isGrosseNull > 0)
		{
			BMI = koerperGewicht / (koerperGrosse* koerperGrosse);
			// Type Casting, ich bekomme hier den BMI ohne Kommastellen 
			BMIInt = (int)BMI;
			System.out.println("Der Body Mass Index ist : " + BMI );
			System.out.println("Der Body Mass Index ohne Kommastellen ist : " + BMIInt );
		}
		else
		{
			System.out.println("Die Körpergroße darf nicht null oder negative sein.\nTschüß");
		}
		
		
		

	}

}
