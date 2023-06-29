import java.util.Scanner;

public class ZeroOrNonZeroNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=sc.nextInt();
		if(n>=0 && n<=0)
		{
			System.out.println("It is Zero Number");
		}
		else {
			System.out.println("It is Non zero Number");
		}

	}

}
