package aufgabenblatt6;

public class Negation extends LogikGatter{
	private boolean state;
	public Negation(LogikGatter input){
		super(input);
		typ = GatterTyp.NEGATION;
		state = !input.auswerten();
	}

	@Override
	public boolean auswerten() {
		
		return  state ;
	}

	@Override
	public int getAnzahlEingaenge() {
		return 1;
	}

}
