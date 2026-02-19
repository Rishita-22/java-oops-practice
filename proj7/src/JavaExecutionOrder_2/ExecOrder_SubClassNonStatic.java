package JavaExecutionOrder_2;

class C {

    void nonStaticFunction() {
        System.out.println("4. C non-static function");
    }

    static void staticFunction() {
        System.out.println("2. C static function");
    }

    static void staticMethod() {
        System.out.println("3. C static method");
    }

    C() {
        System.out.println("5. C constructor");
    }
}

public class ExecOrder_SubClassNonStatic {
	
	static void staticMethodMain() {
        System.out.println("1. Main static method");
    }

    ExecOrder_SubClassNonStatic() {
        System.out.println("6. Main constructor");
    }

    void nonStaticMethodMain() {
        System.out.println("7. Main non-static method");
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticMethodMain();

        C.staticFunction();
        C.staticMethod();

        C c = new C();
        c.nonStaticFunction();

        ExecOrder_SubClassNonStatic obj = new ExecOrder_SubClassNonStatic();
        obj.nonStaticMethodMain();

	}

}
