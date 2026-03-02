package Abstract_class_intro;

abstract class C //if abstract method present inside class then class has to be made abstract
{
	abstract void show();
	
	// can have non-static,static variables , methods etc.
}

abstract class D extends C // child class inherited from from parent abstract class needs to be abstract
{
	void look()
	{
		System.out.println("concrete method look() ");
	}
}
public class MyTest2 {

	public static void main(String[] args) {
		
		C ob ; //no error as abstract class can have reference
		//ob = new D(); error as both parent and child class are abstract
		
		
	}

}
