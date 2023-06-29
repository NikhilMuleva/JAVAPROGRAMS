public class QuickSort {
	public static void quickSort(int[] arr,int low,int high) {
		if(low>high)
			return;
		int mid = (low+high)/2;
		int i=low,j=high;
		int  pivot=arr[mid];
		while(i<=j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}
			while(arr[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		quickSort(arr, low, j);
		quickSort(arr, i ,high);
	}
	

	public static void main(String[] args) {
		int arr[] = {17,53,43,21,4,34,12,22};
		quickSort(arr,0,arr.length-1);
		for(int a:arr)
		{
			System.out.println(a);
		}

	}

}
