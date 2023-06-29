package Array;

public class Bike {
	String name;
	String color;
	int price;

	public Bike(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public static void main(String[] args) {
		Bike b1= new Bike("Duke","red",10000);
		Bike b2= new Bike("Hero","black",70000);
		Bike b3= new Bike("Pulsure","Blue",1255000);
		
		Bike x[]= {b1,b2,b3};
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i].name+" "+x[i].color+" "+x[i].price);
			
		}

	}

}
