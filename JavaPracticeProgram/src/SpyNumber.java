import java.util.Scanner;
// Sum of each digit is equal to the sum of product of number
//Example :-The sum of the digits of 123 = 1 + 2 + 3 = 6
//          The product of the digits of 123 = 1 * 2 * 3 = 6 =>> is Spy Number
//The sum of the digits of 234 = 2 + 3 + 4 = 9
//The product of the digits of 234 = 2 * 3 * 4 = 24 ==> is Not spy Number


public class SpyNumber {
	public static boolean isSpyNumber(int n)
	{
		int sum=0,prod=1;
		while(n>0)
		{
			int r =n%10;
			sum=sum+r;
			prod=prod*r;
			n=n/10;
			
		}
		return sum==prod;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean rs = isSpyNumber(n);
		if(rs==true)
		{
			System.out.println(n+" is Spy Number");
		}
		else
		{
			System.out.println(n+" is Not Spy number");
		}
	}

}
