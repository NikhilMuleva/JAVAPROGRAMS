import java.util.Arrays;

public class MergeSort {
	public static int[] divide(int[] arr)
	{
		if(arr.length==1)
			return arr;
		int mid=arr.length/2;
		int left[]=divide(Arrays.copyOfRange(arr, 0, mid));
		int right[]=divide(Arrays.copyOfRange(arr, mid, arr.length));
		return merge(left ,right);
	}
	
	public static int[] merge(int left[],int right[])
	{
		int[] merge= new int[left.length+right.length];
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
				merge[k++]=left[i++];
			else
				merge[k++]=right[j++];
		}
		while(i<left.length)
		{
			merge[k++]=left[i++];
			
		}
		while(j<right.length)
		{
			merge[k++]=right[j++];
		}
		return merge;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 1, 5, 6, 2, 3 };
		int[] sorted = divide(arr);
		for (int a : sorted) {
			System.out.println(a);
		}

	}

	

}
