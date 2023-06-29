import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth");
		
		double length=sc.nextDouble();
		double breadth =sc.nextDouble();
		
		double z= length*breadth;
		double a = 2*(length+breadth);
		
		
	
		System.out.println("area of parametre"+ z);
		System.out.println("area of rectangle: "+a);
		

	}

}
