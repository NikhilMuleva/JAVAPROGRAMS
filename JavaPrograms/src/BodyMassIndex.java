import java.util.Scanner;
//Body Mass Index bmi=w/(h*h)
public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of width and Height");
		double  w =sc.nextDouble();
		double  h = sc.nextDouble();
		double bmi=w/(h*h);
		
		System.out.println("Body Mass index is: "+bmi);
		

	}

}
