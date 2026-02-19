package SingleInheritance_w_AS_2;

public class C extends P {
	
	private int y;
	
	void disp()
	{
		System.out.println("y value=" +y);
	}
	
	C()
	{
		super(); // it helps in calling P() constructor
		y=20;
	}

}
