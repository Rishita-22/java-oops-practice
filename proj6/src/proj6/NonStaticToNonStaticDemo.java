package proj6;

public class NonStaticToNonStaticDemo {
	
	void first()
	{
		System.out.println("First non-static method");
	}
	
	 void second() 
	 {
		    // (a) Direct access (BEST)
	        first();

	     // (b) By object (extra object, not required)
	        NonStaticToNonStaticDemo obj = new NonStaticToNonStaticDemo();
	        obj.first();
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
