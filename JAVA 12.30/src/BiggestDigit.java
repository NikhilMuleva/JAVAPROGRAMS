import java.util.Scanner;
public class BiggestDigit {
	static int bigDigit(int n)
	{
		int big=0;
		while(n!=0)
		{
			int d=n%10;
			if(big<d)
			{
				big=d;
			}
			n=n/10;
		}
		return big;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the Number: ");
		int n= sc.nextInt();
		int s=bigDigit(n);
		System.out.println("Biggest number of "+n+ " is "+s);

	}

}
