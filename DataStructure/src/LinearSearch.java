
public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {56,44,32,98,21};
		int k =32;
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(k==arr[i])
	    	{
	    		System.out.println("found");
	    	    return ;	
	    	}
	    	
	    }
	    System.out.println("Not found");
	}

}
