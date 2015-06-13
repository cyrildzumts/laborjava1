package aufgabenblatt6;

public class GatterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LogikGatter gatter ;
		Konstante input1 = new Konstante(false);
		Konstante input2 = new Konstante(false);
		Und undGatter = new Und(new Konstante(input1.auswerten()),new Konstante(input2.auswerten()));
		Oder oderGatter = new Oder(new Konstante(input1.auswerten()),new Konstante(input2.auswerten()));
		Negation negationGatter = new Negation( new Konstante(undGatter.auswerten()));
		oderGatter = new Oder(new Konstante(undGatter.auswerten()),new Konstante(oderGatter.auswerten()));
		undGatter = new Und(new Konstante(negationGatter.auswerten()),new Konstante(oderGatter.auswerten()));
		
		System.out.println("Konstante 1     Konstante 2      Wert ");
		System.out.println( " " + input1 + "           " + input2 + "           " + undGatter);
		
	}

}
