import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base and Height");
		double base =sc.nextDouble();
		double height=sc.nextDouble();
		
		double area=(base*height)/2;
		System.out.println("Area of triangle: "+area);

	}

}
