package Abstract_class_intro;

abstract class E //if abstract method present inside class then class has to be made abstract
{
	abstract void show();
	
	// can have non-static,static variables , methods etc.
}

class F extends E // child class doesn't need to be abstract if parent class abstract method is overridden
{
	void show() // parent class method overridden
	{
		System.out.println("abstract method show() overridden ");
	}
}
public class MyTest3 {

	public static void main(String[] args) {
		E ob = new F(); // child class obj can be created and used to access parent (upcasting used) 
		ob.show();

	}

}
