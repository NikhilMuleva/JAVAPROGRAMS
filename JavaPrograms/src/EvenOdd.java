
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("The Number is Even");

		} else {
			System.out.println("The Number is odd");

		}

		// one more w can check even or odd
		if (n / 2 * 2 == n) {
			System.out.println("Even ");

		} else {
			System.out.println("odd");
		}
	}

}
