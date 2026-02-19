package proj6_3;

public class StaticToOutsideInstanceVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (a) Only by object creation
        InstanceVariable obj = new InstanceVariable();
        System.out.println(obj.y);
        
     // Change value using object
        obj.y = 80;

        System.out.println(obj.y); //(change applied is not static varies from varible to variable)

	}

}
