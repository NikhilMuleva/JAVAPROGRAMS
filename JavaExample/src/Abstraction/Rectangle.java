package Abstraction;

public class Rectangle  extends Shape{
	@Override
	public void area()
	{
		System.out.println(Length * Breadth);
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.Length=2;
		r.Breadth=5;
		r.area();
		System.out.println();

	}

}
