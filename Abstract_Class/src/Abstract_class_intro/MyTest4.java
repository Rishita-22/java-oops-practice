package Abstract_class_intro;

abstract class Shape
{
	abstract double area();
	abstract double perimeter();
}

class Rectangle extends Shape 
{
	double L,B;
	
	public Rectangle(double l, double b) {
		super();
		this.L = l;
		this.B = b;
	}
	
	public Rectangle() {
		super();
	}

	@Override
	double area() {
		return L * B;
	}

	@Override
	double perimeter() {
		return 2 * (L + B);
	}
	
}

class Square extends Shape // child class doesn't need to be abstract if parent class abstract method is overridden.
{
	double S;

	
	public Square(double s) {
		super();
		this.S = s;
	}
	
	public Square() {
		super();
	}

	@Override
	double area() {
		return S * S;
	}

	@Override
	double perimeter() {
		return 4 * S;
	}
	
}

public class MyTest4 {

	public static void main(String[] args) {
		
		Shape r = new Rectangle(10, 5);
		Shape s = new Square(4);
		
		System.out.println("Rectangle Area: "+r.area());
		System.out.println("Rectangle Perimeter: "+r.perimeter());
		
		System.out.println("Square Area: "+s.area());
		System.out.println("Square Perimeter: "+s.perimeter());

	}

}
