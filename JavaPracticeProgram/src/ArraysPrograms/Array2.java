package ArraysPrograms;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int n=sc.nextInt();
		double per[]= new double[n];
		System.out.println("Enter the Element of percentage: "+n);
		for(int i=0;i<per.length;i++)
		{
			per[i]=sc.nextDouble();
		}
		
		System.out.println("Print Students the Percentage");
		for(int i=0;i<per.length;i++)
		{
			System.out.println(per[i]);
		}
	}

}
