import java.util.Scanner;

//Read the Three distinct values from the user and the print  Middle values
public class MiddleValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Three Numbers: ");
		int a =sc.nextInt();
		int b= sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a<c || a>c && a<b)
		{
			System.out.println(a+" Is Middle");
		}
		else if(b>a && b<c || b<a && b>c)
		{
			System.out.println(b+" Is is Middle");
		}
		else
		{
			System.out.println(c+" is middle");
		}
		

	}

}
