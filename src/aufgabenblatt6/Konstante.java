package aufgabenblatt6;

public class Konstante extends LogikGatter{

	/**
	 * Der Zustandniveau des Gatters
	 */
	private boolean  state;
	
	public Konstante(boolean state) {
		super(null);
		this.state = state;
		typ = GatterTyp.KONSTANTE;
	}
	@Override
	public boolean auswerten() {

		return state;
	}
	@Override
	public int getAnzahlEingaenge() {
		return 0;
	}

}
