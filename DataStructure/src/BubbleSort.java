
public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {2,5,4,7,1};
		int n=arr.length-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}

}
