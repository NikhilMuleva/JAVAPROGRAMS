package ArraysPrograms;

import java.util.Scanner;

public class EvenOddArray {
	public static int[] countEvenOdd(int arr[])
	{
		int count[]= new int[2];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count[0]++;
			}
			else {
				count[1]++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Element:");
			arr[i]=sc.nextInt();
		}
		
		int count[]=countEvenOdd(arr);
		System.out.println("The Count of Even Number is: "+count[0]);
		System.out.println("The count of Odd Number is: "+count[1]);

	}

}
