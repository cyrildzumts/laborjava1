package playground;

 class WebseiteStub {
	 public static int count = 0;
	private int ref ;
	private int zahl1;
	private int zahl2;
	
	public void info()
	{
		System.out.format("Info on Paar %d :\n",ref);
		System.out.format("Zahl1 : %d\nZahl2 : %d\n", zahl1, zahl2);
	}
	WebseiteStub(int z1, int z2)
	{
		
		ref =++count;
		zahl1 = z1;
		zahl2 = z2;
	}
	
	WebseiteStub(WebseiteStub stub)
	{
		this(stub.zahl1 = 0,stub.zahl2 = 2);
	}
}
