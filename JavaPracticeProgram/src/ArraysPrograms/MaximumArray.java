package ArraysPrograms;

import java.util.Scanner;

public class MaximumArray {
	public static int maxArray(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Element: ");
			arr[i]=sc.nextInt();
		}
		
		int big= maxArray(arr);
		System.out.println("The Biggest Elements of array is: "+big);
		
	}

}
