package Abstract_class_intro;

abstract class B //if abstract method present inside class then class has to be made abstract
{
	abstract void show();
	
	// can have non-static,static variables , methods etc.
}
public class MyTest1 {

	public static void main(String[] args) {
		A ob; //no error as abstract class can have reference 
		// ob=new A(); error as object can't be created of abstract class

	}

}
