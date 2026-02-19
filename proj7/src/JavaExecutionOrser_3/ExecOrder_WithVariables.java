package JavaExecutionOrser_3;

class D {

    // Static variable (initialized FIRST – in written order)
    static int x = 10;

    // Static function
    static void staticFunction() {
        System.out.println("2. Static function, x = " + x);
    }

    // Static method
    static void staticMethod() {
        System.out.println("3. Static method");
    }

    // Non-static variable (per object)
    int y = 20;

    // Constructor
    D() {
        System.out.println("4. Constructor, y = " + y);
    }

    // Non-static function
    void nonStaticFunction() {
        System.out.println("5. Non-static function");
    }
}

public class ExecOrder_WithVariables {
	
	static void staticMethodMain() {
        System.out.println("1. Main static method");
    }

    ExecOrder_WithVariables() {
        System.out.println("6. Main constructor");
    }

    void nonStaticMethodMain() {
        System.out.println("7. Main non-static method");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticMethodMain();

        D.staticFunction();
        D.staticMethod();

        D d = new D();
        d.nonStaticFunction();

        ExecOrder_WithVariables obj = new ExecOrder_WithVariables();
        obj.nonStaticMethodMain();

	}

}
