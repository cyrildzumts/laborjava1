package aufgabenblatt6;

public class Oder extends LogikGatter {
	
	public Oder(LogikGatter input1, LogikGatter input2){
		super(input1,input2);
		typ = GatterTyp.ODER;
	}

	@Override
	public boolean auswerten() {
		
		return  eingabe1.auswerten() || eingabe2.auswerten();
	}

	@Override
	public int getAnzahlEingaenge() {
		// TODO Auto-generated method stub
		return 2;
	}
	
	
	
	
	

}
