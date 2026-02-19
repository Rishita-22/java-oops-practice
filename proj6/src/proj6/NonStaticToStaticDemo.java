package proj6;

public class NonStaticToStaticDemo {
	
	 static void greet()
	 {
		 System.out.println("Static method greet()");
	 }
	 
	 void call() {

	        // (a) Direct access 
	        greet();

	        // (b) By class name
	        NonStaticToStaticDemo.greet();
	        
	        /* 
	        (c) By object (allowed, not required)
	        NonStaticToStaticDemo obj = new NonStaticToStaticDemo();
	        obj.greet();
	        */

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticToStaticDemo obj = new NonStaticToStaticDemo();
        obj.call();

	}

}
