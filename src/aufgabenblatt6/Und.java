package aufgabenblatt6;

public class Und extends LogikGatter{
	
	boolean state ;
	public Und(LogikGatter input1, LogikGatter input2){
		super(input1,input2);
		typ = GatterTyp.UND;
		state = input1.auswerten() && input2.auswerten();
	}

	@Override
	public boolean auswerten() {
		
		return  eingabe1.auswerten() && eingabe2.auswerten();
	}

	@Override
	public int getAnzahlEingaenge() {
		return 2;
	}

}
