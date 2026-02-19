package SingleInheritance_w_AS_1;

public class C extends P {
	
	private int y; // private variable can't be accessed outside class 
	
	void disp() // method helps to access private variable
	{
		System.out.println("y value=" +y);
	}
	
	void initc() //method helps to initialize private variable
	{
		y=20;
	}

}
