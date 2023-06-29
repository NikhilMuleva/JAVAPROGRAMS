import java.util.Scanner;

public class duck {
	public static boolean isDuck(int n) {
		int rem, count = 0;
		while (n != 0) {
			rem = n % 10;
			
			n = n / 10;
		}
		
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		boolean rs = isDuck(n);
		if (rs == true) {
			System.out.println(n + " is Duck Number");
		} else {
			System.out.println(n + " is not Duck Number");
		}

	}
}
