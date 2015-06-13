package playground;

public class Rectangle extends Figure{

	//private int forme;
	public Rectangle(){
		super(4);
	}
	
	public int perimetre(){
		forme = 5;
		return 4* getCote();
	}
}
