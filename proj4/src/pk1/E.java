package pk1;

import pk.*;

public class E extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E ob=new E();
		//System.out.println(ob.p); error
		//System.out.println(ob.p); error
		System.out.println(ob.r); // protected variable can be accessed using inheritance
		System.out.println(ob.s); // public variable accessed everywhere
	}

}
