package aufgabenblatt6;

public class RoboterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutonomerRoboter roboter = 
		        new AutonomerRoboter(new AufRaedernRollen (), 
		            new LaserScannerWahrnehmung ()); 
		  roboter.nimmUmgebungWahr(); 
		  roboter.bewegeVorwaerts(); 
		  roboter.setBewegungsVerhalten(new AufKettenRollen ()); 
		  roboter.setUmgebungsWahrnehmungsVerhalten(new UltraSchallWahrnehmung ()); 
		  roboter.nimmUmgebungWahr(); 
		  roboter.bewegeVorwaerts(); 

	}

}
