package Abstraction;

public class Lamborghini extends Car {
	@Override
	public void topSpeedDetails()
	{
		System.out.println("The car speed is 320kmph");
		
	}

	public static void main(String[] args) {
		Lamborghini l = new Lamborghini();
		l.name="Inova";
		l.price=28884848;
		l.display();
		l.topSpeedDetails();
		System.out.println();

	}

}
