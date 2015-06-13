package aufgabenblatt2;
import java.util.Scanner;
/*********************************************************
 * Semester 1, SS15
 * Praktikum 1.
 * Aufgabenblatt 2, Fibonacci
 * Technische Informatik
 * HAW HAMBURG
 * Prof : Philipp Jenke
 * @author Cyrille Ngassam Nkwenga. 
 * EMAIL : Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * 
 * Description : Dieses Programm liefert uns die 
 * Fibonacci Zahl die sich an der Stelle n befindet, wo der 
 * Benutzer eingegeben hat:
 * 0,1,1,2,3,5,8 ...
 * z.B : eingabe: 4 -----> Fibonacci Zahl : 5
 *
 */

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Grundlagen : Fn = Fn-2 + Fn-1 , für n >= 2
		Scanner input = new Scanner(System.in);
		int fn = 0;
		// Fn1 = Fn-1, Fn2 = Fn-2;
		int fn1 = 0, fn2 = 0, eingabe = 0;
		System.out.println("Wir Wollen eine Fibonacci Reihe berechnen ");
		System.out.println("Geben Sie bitte jetzt einen Index der Nummer der Reihe ein (>= 2) ");
		eingabe = input.nextInt();
		input.close();
		
		if( eingabe <= 0 )
		{
			fn = 0;
			System.out.println("Lesen Sie es doch mal richtig, Sie müssen einen Wert >= 2 eingeben !!  ");
		}
			
		else if((eingabe == 1))
		{
			fn = 1;
			System.out.println("Lesen Sie es doch mal richtig, Sie müssen einen Wert >= 2 eingeben !!  ");
		}
		else if(eingabe >=2)
		{
			fn = 1;
			fn1 = 1;
			fn2 = 0;
			for(int i = 2; i < eingabe; i++)
			{
//				fn1 = fn2;
//				fn2 = fn;
//				fn = fn2 + fn1;
				
				
				fn2 = fn1;
				fn1 = fn;
				fn = fn2 + fn1;
				
				
			}
		}
		System.out.println("Die Fibonacci Zahl ist : " + fn);
		//System.out.format("Die Fibonacci Zahl ist : %d\n" , fn);
		//System.out.print("Tschüß");

	}

}
