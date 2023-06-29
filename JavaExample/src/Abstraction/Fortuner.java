package Abstraction;

public class Fortuner  extends Car{
	@Override
	public void topSpeedDetails()
	{
		System.out.println("the speed is 300kmph");
	}

	public static void main(String[] args) {
		Fortuner f = new Fortuner();
		f.name="jkf";
		f.price=666;
		f.display();
		f.topSpeedDetails();

	}

}
