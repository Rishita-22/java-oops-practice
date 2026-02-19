package proj5;

public class Square {
	private int side;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	void show()
	{
		System.out.println("Side="+side);
	}
	
	void update(int side)
	{
		this.side=side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
}
