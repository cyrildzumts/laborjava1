package aufgabenblatt6;

public class AutonomerRoboter {
	
	private WahrnehmungsInterface wahrnehmung  = new LaserScannerWahrnehmung();
	private BewegungsInterface bewegung;
	
	public AutonomerRoboter (BewegungsInterface bewegung, WahrnehmungsInterface wahrnehmung){
		this.wahrnehmung = wahrnehmung;
		this.bewegung = bewegung;
	}
	
	public void nimmUmgebungWahr(){
		wahrnehmung.nimmUmgebungWahr();
	}
	
	public void bewegeVorwaerts(){
		bewegung.bewegeVorwaerts();
	}
	void setBewegungsVerhalten(BewegungsInterface bewegung){
		this.bewegung = bewegung;
	}
	
	void setUmgebungsWahrnehmungsVerhalten(WahrnehmungsInterface wahrnehmung){
		this.wahrnehmung = wahrnehmung;
	}
}
