
public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {7,8,12,9,2,5};
		for(int i=1;i<arr.length;i++)
		{
			int key =arr[i];
			int j=i-1;
			while(j!=-1 && key<arr[j])
			{
				arr[j+1]=arr[j];//shifting to next place
				j--;
			}
			arr[j+1]=key;
		}
		for(int a:arr)
		{
			System.out.println(a);
		}

	}

}
