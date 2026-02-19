package proj6_1;

public class StaticToOutsideStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (a) By class name (BEST)
        OtherStaticMethod.show();

        /*
        (b) By object (allowed, not recommended)
        OtherStaticMethod obj = new OtherStaticMethod();
        obj.show();
        */

	}

}
