package Parameter_constructor;

public class B extends A {
	
	B(int x,int y)
	{
           super(x); //calls parent class parameterized constructor 
         System.out.println("parameter BC "+y);
	}

}
