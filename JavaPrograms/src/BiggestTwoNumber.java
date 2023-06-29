import java.util.Scanner;

public class BiggestTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int big =(a>b)?a:b;
		System.out.println("The Biggest the Number is :"+big);
		if(a>b)
		{
			System.out.println(a+ "is Big");
		}
		else
		{
			System.out.println(b+ " is Big");
		}

	}

}
