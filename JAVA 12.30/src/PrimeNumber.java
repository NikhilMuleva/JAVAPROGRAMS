import java.util.Scanner;
public class PrimeNumber {
	static boolean isPrime(int x)
	{
		for(int i=2;i<=x;i++) // or i*i<=x or,i<=x/2
		{
			if(x%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n= sc.nextInt();
		boolean rs=isPrime(n);
		if(rs==true)
		{
			System.out.println(n+" is Prime Number");
		}
		else
		{
			System.out.println(n+" is Not Prime Number");
		}
	}

}
