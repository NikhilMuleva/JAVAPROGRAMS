import java.util.Scanner;

//A special number can be defined as a number in which the sum of the product of its digits and 
//the sum of the digits is equal to the number. 



public class SpecialDigitNumber {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the Two Numbers");
		int x = sc.nextInt();
		int d1= x/10;
		int d2= x%10;
		int sum= d1+d2 +d1*d2;
		if(sum==x)
		{
			System.out.println(x +" is a special two digit Number");
		}
		else {
			System.out.println(x +" is not a special two digit number");
		}
		

	}

}
