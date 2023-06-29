package Chaining;

public class Car {
	Car()
	{
		System.out.println("Car 1");
	}
	Car(int x)
	{
		this();
		System.out.println("Car2");
	}
	Car(String n)
	{
		this(10);
		System.out.println(" Car 3");
	}
	Car(double d)
	{
		this("n");
		System.out.println("Car4");
		
		
	}

	public static void main(String[] args) {
		Car c = new Car(2.1);

	}

}
