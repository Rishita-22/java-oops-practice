package proj6_4;

public class StaticMethodAccessStaticVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (a) BEST way: access by class name
        System.out.println(StaticVariableOutsideClass.x);

        /* 
        (b) Allowed but NOT recommended: access by object
        StaticVariableOutsideClass obj = new StaticVariableOutsideClass();
        System.out.println(obj.x);
        */

        // Change value
        StaticVariableOutsideClass.x = 200;

        // Value changes for class and all objects
        System.out.println(StaticVariableOutsideClass.x);
        
        //System.out.println(obj.x); (not recommended)

	}

}
