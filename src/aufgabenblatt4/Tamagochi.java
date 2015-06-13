package aufgabenblatt4;

import java.util.Scanner;

/*********************************************************
 * @version 1.0
 * Semester 1, SS15
 * Praktikum 1.
 * Aufgabenblatt 4, Tamagochi
 * Technische Informatik
 * HAW HAMBURG
 * Prof : Philipp Jenke
 * @author Cyrille Ngassam Nkwenga
 * EMAIL : Cyrille.Ngassam.Nkwenga@haw-hamburg.de
 * 
 * Description : Diese Klasse implementiert ein Tamagotchi-Spiel. Sie interagieren mit dem Tamagotchi, indem
 * Sie Kommandos schicken (iss, schlaf, spiel, nichts). Der Zustand des Tamagotchis wird durch drei
 * Eigenschaften beschrieben: Hunger (Objektvariable hunger), Langeweile (Objektvariable
 * langeweile) und Müdigkeit (Objektvariable muedigkeit). Die Variablen nehmen minimal den Wert
 * 0 an - dann ist alles in Ordnung. Die Werte koennen allerdings zunehmen. Ab dem Wert 4 beschwert
 * sich das Tamagotchi. In jeder Runde werden die Werte etwas schlechter.
 */

public class Tamagochi {
	private int hunger;
	private int langweile;
	private int muedigkeit;
	//private int punktestand;
	
	// Privaten Methode Definition
	private void printPunktestand()
	{
		
		System.out.format("Ihr aktuelle Punktestand ist : %d\n", getPunktestand());
		
	}
	
	/**
	 * Diese Method fuehrt den Befehl kommando aus
	 * @param kommando ist der Befehl der zugefuehrt werden
	 * muss. Wenn kommando kein gueltige Befehl ist, wird 
	 * er ignoriert.
	 */
	private void verarbeiteKommando(String kommando)
	{
		switch(kommando){
		case "iss" :
			iss();
			break;
		case "schlaf" :
			schlaf();
			break;
		case "spiel" :
			spiel();
			break;
		case "nichts" :
			break;
		default:
			System.out.println("Ungültiger Befehl, versuchen nochmal.");
			break;
		}
		
		
	}
	
	// Public Methode Definition
	/**
	 *  Diese Method erhoet alle Eigenschaften des Tamagochis
	 *  um 1. Wenn ein Eigenschaft > 3 ist, zeigt diese Method eine 
	 *  meldung an.
	 */
	public void tick()
	{
		if(++hunger > 3)
			System.out.println("Hunger :" + hunger);
		if(++langweile > 3)
			System.out.println("Langweile : " + langweile);
		if(++muedigkeit > 3)
			System.out.println("Müde : " + muedigkeit);
	}
	/**
	 * Diese Method setzt die Objektvariable hunger auf 0
	 * und inkrementiert langweile.
	 */
	public void iss()
	{
		hunger = 0;
		langweile ++;
	}
	
	/**
	 * Diese Method setzt die Objektvariable langweile und muedigkeit
	 *  auf 0  und inkrementiert hunger
	 */
	public void schlaf()
	{
		muedigkeit = 0;
		langweile = 0;
		hunger++;
	}
	
	/**
	 * Diese Method setzt die Objektvariable langweile 
	 *  auf 0  und inkrementiert hunger und muedigkeit
	 */
	public void spiel()
	{
		langweile = 0;
		muedigkeit++;
		hunger++;
	}
	
	/**
	 * In dieser Method wird der Zustand des Tamagotchis  durch einen Punktestand
	 * beschrieben, der zu jedem Zeitpunkt neu berechnet wird: Fuer jeden
	 * Statuswert < 4 gibt es einen Punkt, für jeden Wert >= 4 gibt es zwei
	 * Minuspunkte. Schreiben Sie eine Methode int getPunktestand(), die den aktuellen punktestand
	 * berechnet und zurueckliefert.
	 * @return punktestand
	 */
	public int getPunktestand()
	{
		int punktestand = 0;
		
		if(hunger < 4 )
			punktestand++;
		else punktestand -= 2;
		
	
		if(langweile < 4)
			punktestand++;
		else punktestand-= 2;
		
		if (muedigkeit < 4)
			punktestand++;
		else punktestand-= 2;
		
		/*wenn punktestand negativ ist, wir setzen den Stand
		 * auf 0. 
		 */
		//if(punktestand < 0)
			//punktestand = 0;
		
		return punktestand;
	}
	
	
	public Tamagochi()
	{
		hunger = 0;
		muedigkeit = 0;
		langweile = 0;
		
	}

	public static void main(String[] args)
	{
		Tamagochi tamagochi = new Tamagochi();
		String kommando = new String("");
		Scanner eingabe = new Scanner(System.in);
		System.out.println("***************************************************************************");
		System.out.println("****************************** Tagomatchi Spiel ***************************");
		System.out.println("Willkommen . Zu spielen Sie müssen jedesmal Tagomatchi einen Befehl geben.");
		System.out.println("***************************************************************************");
		System.out.println("Hinweis 1: Die gültige Befehl sind : iss, schlaf, spiel und nichts");
		System.out.println("Wenn Sie aber das spiel beenden wollen, geben Sie dann 'ende' als Befehl ein.");
		System.out.println("***************************************************************************");
		while(true)
		{
			tamagochi.tick();
			tamagochi.printPunktestand();
			//System.out.println("Tamagochi Punktestand : " + tamagochi.getPunktestand());
			System.out.println("Geben Sie einen Befehl ein.");
			System.out.print("Befehl : ");
			kommando = eingabe.next();
			tamagochi.verarbeiteKommando(kommando);
			if(kommando.equals("ende"))
			{
				System.out.println("Danke dass Sie mitgespielt haben.");
				break;
			}
		}
		eingabe.close();
	}
}