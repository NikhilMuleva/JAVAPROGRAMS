import java.util.Scanner;
public class Large3Num {
	static void largeNum(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a+" is Big");
		}
		else if(b>c)
		{
			System.out.println(b+" is Big");
		}
		else
		{
			System.out.println(c+" is Big");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		largeNum(a,b,c);

	}

}
