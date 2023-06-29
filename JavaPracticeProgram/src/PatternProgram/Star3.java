package PatternProgram;
//Enter the Number
//5
// *     *
//  *   *
//   * *
//    *
import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int j=1;j<(n-i-1)*2;j++)
			{
				System.out.print(" ");
			}
			if(i!=n-1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
