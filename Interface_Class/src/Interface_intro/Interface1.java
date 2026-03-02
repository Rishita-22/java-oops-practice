package Interface_intro;
interface A  // only keeps abstract methods , cant create object
{
	abstract void show(); // it is implicitly abstract public void show();
	
	// inside interface every default thing is abstract
	// can't have constructors , non-static,static variables , concrete methods etc.
	// gives abstract public designation to default members (variables,methods)
	// needs initialisation for variables (public static int x); abstract keyword implicitly present
}

class B implements A 
{
	public void show()
	{
		System.out.println(" abstract method show() overridden ");
		//Parent(interface class) method has to be overriden in child with public access specifier
		// if not then child class needs to have abstract keyword
	}
	
}
public class Interface1 {

	public static void main(String[] args) {
		A ob = new B();
		ob.show();

	}

}
