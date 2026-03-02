package Abstract_class_intro;

abstract class A
{
	A()
	{
		System.out.println("Abstract class can have constructor");
	}
	// Similarly can have non-static,static variables , methods etc.
}

public class MyTest {

	public static void main(String[] args) {
		A ob; //no error as abstract class can have reference 
		// ob=new A(); error as object can't be created of abstract class


	}

}
