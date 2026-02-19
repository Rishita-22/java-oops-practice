package pk;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P ob=new P();
		ob.f1();
		//ob.f2();error
		
		C obj=new C();
		obj.f1();
		obj.f2();
		

	}

}
