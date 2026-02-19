package pk;

public class MyMath {
	
	public int no1,no2;
	
	public MyMath(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
	}
	
	public void add()
	{
		System.out.println("Sum="+(no1+no2));
	}
	
	public int sub()
	{
		return no1-no2;
	}

}
