package JavaExecutionOrder;

public class ExecOrder_MainOnly {
	
	// Static method
    static void staticMethod() 
    {
        System.out.println("1. Static method of main class");
    }

    // Constructor
    ExecOrder_MainOnly() 
    {
        System.out.println("3. Constructor of main class");
    }

    // Non-static method
    void nonStaticMethod() 
    {
        System.out.println("4. Non-static method of main class");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticMethod();                 // static

        ExecOrder_MainOnly obj = new ExecOrder_MainOnly();   // constructor

        obj.nonStaticMethod();           // non-static

	}

}
