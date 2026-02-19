package JavaExecutionOrder_1;

public class A {
	
	static void staticMethodA() 
	{
        System.out.println("2. A static method");
    }

    A() 
    {
        System.out.println("4. A constructor");
    }

    void nonStaticMethodA() 
    {
        System.out.println("5. A non-static method");
    }

}
