package playground;
import playground.WebseiteStub;
public class PaarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebseiteStub paar1 = new WebseiteStub(2,3);
		WebseiteStub paar2 = new WebseiteStub(paar1);
		
		paar1.info();
		paar2.info();
	}

}
