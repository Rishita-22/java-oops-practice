package SingleInheritance_w_AS_1;

public class P { 
	private int x ; // private variable cant be accessed outside class 
	void show() // method helps to access private variable
	{
		System.out.println("x value=" +x);
	}
	void initp() //method helps to initialize private variable
	{
		x=10;
	}

}
