package playground;

public  class Figure {

	
	private int nombreCote;
	protected int forme;
	
	public  int getCote(){
		return nombreCote;
	}
	public void setCote(int cote){
		nombreCote = cote;
	}
	public int perimetre(){
		return 1;
		}
	
	public int surface(){
		return 2;
	}
	public void dessine(){
		
	}
	
	public Figure(){
		nombreCote = 1;
	}
	public Figure(int cote){
		nombreCote = cote;
	}
}
