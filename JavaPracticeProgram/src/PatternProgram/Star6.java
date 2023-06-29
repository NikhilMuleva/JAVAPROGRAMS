package PatternProgram;

import java.util.Scanner;

public class Star6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		int m=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==n || (i==j && i<=m) || (i+j==n+1 && i<=m))
				{
					System.out.print("*");
				}
				else {
					
				     System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
