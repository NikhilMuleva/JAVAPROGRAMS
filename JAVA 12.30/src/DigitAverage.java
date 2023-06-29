import java.util.Scanner;
public class DigitAverage {
	static double averageDigit(int n)
	{
		int sum=0;
		int c=countDigit(n);
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
			
		}
		return sum/c;
	}
	static int countDigit(int n)
	{
		int count=0;
		while(n!=0)
		{
			int r=n%10;
			count++;
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the Number: ");
		int n= sc.nextInt();
		double d=averageDigit(n);
		System.out.println("Average of Number "+n+" is "+d);
		

	}

}
