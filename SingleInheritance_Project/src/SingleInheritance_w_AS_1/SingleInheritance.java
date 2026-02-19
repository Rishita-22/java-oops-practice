package SingleInheritance_w_AS_1;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob=new C();
		
		//System.out.println(ob.x); (private variable can't be accessed outside class)
		//System.out.println(ob.y);
		ob.show();
		ob.disp();
		
		//ob.x=10; (cannot initialize private variable outside class)
		//ob.y=20;
		ob.initp();
		ob.initc();
		
		ob.show();
		ob.disp();

	}

}
