
public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {2,15,32,55,98,102};
		int k=89,low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(k==arr[mid])
			{
				System.out.println("Foound");
				return;
			}
			else if(k>arr[mid])
			{
				low=mid+1;
			}
			else if(k<arr[mid])
			{
				high=mid-1;
			}
		}
		System.out.println("Not found");
	}

}
