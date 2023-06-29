import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n =sc.nextInt();
		int s1 =sumNatural(n);
		System.out.println("Sum of the "+n+ " Natural  is :"+s1 );

	}

	 static int sumNatural(int n) {
		 int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

}
