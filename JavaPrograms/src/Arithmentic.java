import java.util.Scanner;

public class Arithmentic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("sum is "+(x+y));
		System.out.println("Differnece is "+(x-y));
		System.out.println("Multiplation "+(x*y));
		System.out.println("Division  "+(x/y));
		System.out.println("module "+(x%y));
	}

}
