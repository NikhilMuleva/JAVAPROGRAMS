package ArraysPrograms;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Element: "+n);
		for(int i=0;i<=arr.length;i++)
		{
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}
		
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("The array is :"+arr[i]);
		}
	}

}
