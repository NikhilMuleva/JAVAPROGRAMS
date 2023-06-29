//Return Reverse of the Number?
import java.util.Scanner;
public class DigitReverse {
	static int reverseDigit(int n) {
		int rev=0;
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n =sc.nextInt();
		int r=reverseDigit(n);
		System.out.println("The number of Digit  "+n+ " in Reverse number "+r);
	}

}
