package SingleInheritance_w_AS_2;

public class P {
	
	private int x; 
	
	void show()
	{
		System.out.println("x value="+x);
	}
	
	P() // constructor initializes as soon as object created so doesn't need separate initialization like in case of method usage
	{
		x=10;
	}

}
