package JavaExecutionOrder_2;

class B {
	
	// Static functions/methods execute in the order they are written when called
    // Static function (written FIRST → executes first when called)
    static void staticFunction() {
        System.out.println("2. B static function");
    }

    static void staticMethod() {
        System.out.println("3. B static method");
    }

    B() {
        System.out.println("4. B constructor");
    }

    void nonStaticMethod() {
        System.out.println("5. B non-static method");
    }
}

public class ExecOrder_SubClassStatic {
	
	static void staticMethodMain() {
        System.out.println("1. Main static method");
    }

    ExecOrder_SubClassStatic() {
        System.out.println("6. Main constructor");
    }

    void nonStaticMethodMain() {
        System.out.println("7. Main non-static method");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        staticMethodMain();

        B.staticFunction();
        B.staticMethod();

        B b = new B();
        b.nonStaticMethod();

        ExecOrder_SubClassStatic obj = new ExecOrder_SubClassStatic();
        obj.nonStaticMethodMain();

	}

}
