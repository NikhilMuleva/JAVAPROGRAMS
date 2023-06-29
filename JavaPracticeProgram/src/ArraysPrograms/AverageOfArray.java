package ArraysPrograms;

import java.util.Scanner;

public class AverageOfArray {
	public static double sumOfAverage(double arr[],int n)
	{
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum/n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n=sc.nextInt();
		double arr[]=new double[n];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Element");
			arr[i]=sc.nextDouble();
		}
		double average=sumOfAverage(arr ,n);
		System.out.println("The sum of average array is : "+average);
	}

}
