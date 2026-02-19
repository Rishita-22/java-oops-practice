package proj6;

public class StaticToNonStaticDemo {
	 void display() 
	 {
		 System.out.println("Non-static method display()");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (a) only accessed by object creation 
		
		StaticToNonStaticDemo obj = new StaticToNonStaticDemo(); //object creation
		obj.display(); //access non-staic method
		

	}
}

