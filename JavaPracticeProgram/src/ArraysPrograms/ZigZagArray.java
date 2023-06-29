package ArraysPrograms;

import java.util.Scanner;

public class ZigZagArray {
	public static int[] zigZag(int x[],int y[])
	{
		int z[]=new int[x.length+y.length];
		int i=0,k=0;
		while(i<x.length && i<y.length)
		{
			z[k]=x[i];
			k++;
		
			z[k]=y[i];
			k++;
			i++;
		}
		while(i<x.length)
		{
			z[k]=x[i];
			k++;
			i++;		
		}
		
		while(i<y.length)
		{
			z[k]=y[i];
			k++;
			i++;
		}
		
		return z;
	}
	public static void dispArray(int z[])
	{
		for(int i=0;i<z.length;i++)
		{
			System.out.println(z[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Array size: ");
		int n1=sc.nextInt();
		int x[]=new int[n1];
		for(int i=0;i<x.length;i++)
		{
			System.out.println("Enter the elements");
			x[i]=sc.nextInt();
			
		}
		System.out.println("Enter the Second Array of size: ");
		int n2=sc.nextInt();
		int y[]= new int [n2];
		for(int i=0;i<y.length;i++)
		{
			System.out.println("Enter the Elements ");
			y[i]=sc.nextInt();
		}
		
		int z[]=zigZag(x,y);
		System.out.println("The array are ZigZag:");
		dispArray(z);

	}

}
