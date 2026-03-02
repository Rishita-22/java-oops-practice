package Constructor_usage1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B(); 
		
		/* obj for B is created , constructor initialized , compiler automatically assigns super() inside B 
		  (implicitly) even though not written by user (explicitly)
		  so , A() is called first then B() - output will be AC then BC
		 */

	}

}
