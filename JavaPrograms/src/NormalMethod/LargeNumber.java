package NormalMethod;

import java.util.Scanner;

//define a method to written biggest among 3 integer Number
public class LargeNumber {
	public static void largNum(int a ,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a+" Is Big");
		}
		else if(b>c)
		{
			System.out.println(b+" is Big");
		}
		else {
			System.out.println(c+" is Big");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Three Number");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		largNum(a, b, c);
		

	}

}
