package ArraysPrograms;

import java.util.Scanner;

public class SumOfDigitArray {
	public static void dispArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void upDate(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sumOfDigit(arr[i]);
		}
	}
	
	public static int sumOfDigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int digit = n%10;
			sum =sum+digit;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Element");
			arr[i]=sc.nextInt();
		}
		
		dispArray(arr);
		
		upDate(arr);
		System.out.println("After the update of sum of array digit");
		
		dispArray(arr);
	}

}
