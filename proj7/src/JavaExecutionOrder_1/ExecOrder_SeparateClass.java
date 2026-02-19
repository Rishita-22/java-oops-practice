package JavaExecutionOrder_1;

public class ExecOrder_SeparateClass {
	
	static void staticMethodMain() {
        System.out.println("1. Main class static method");
    }

    ExecOrder_SeparateClass() {
        System.out.println("6. Main class constructor");
    }

    void nonStaticMethodMain() {
        System.out.println("7. Main class non-static method");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 staticMethodMain();     // static (main class)
	     A.staticMethodA();      // static (separate class)

	     A a = new A();          // constructor (A)
	     a.nonStaticMethodA();   // non-static (A)

	     ExecOrder_SeparateClass obj = new ExecOrder_SeparateClass(); // constructor (main)

	     obj.nonStaticMethodMain();
	 
	}

}
