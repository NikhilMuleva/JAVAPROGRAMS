package Abstraction;

public abstract class Car { 
	String name;
	int price;
	void display()
	{
		System.out.println(this.name+"  "+this.price);
	}
	abstract void topSpeedDetails();

}

