package proj6;

public class StaticToStaticDemo {
	
	static void show() 
	{
		System.out.println("Static method show() ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (a) Direct access
		show(); 
		
		// (b) By class name
		StaticToStaticDemo.show(); 
		
		/* 
	    (c) By object (allowed but NOT recommended)
        StaticToStaticDemo obj = new StaticToStaticDemo();
        obj.show();
        */
	}

}
