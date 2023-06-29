import java.util.Scanner;
public class FactorialNumber {
	public static int isFact(int n)
	{
	  int fact=1;
	  for(int i=1;i<=n;i++)
	  {
		  fact=fact*i;
	  }
	 return fact; 
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n= sc.nextInt();
	int f=isFact(n);
	System.out.println("The number of "+n+" factorial is "+f);
	}
}
