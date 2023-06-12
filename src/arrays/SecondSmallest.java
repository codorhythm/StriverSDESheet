package arrays;

public class SecondSmallest {
	
	public static int SecondSmallest(int arr[])
	{
		int smallest = arr[0];
		int secondSmallest = Integer.MAX_VALUE;
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i]<smallest)
			{
				secondSmallest = smallest;
				smallest = secondSmallest;
			}
			else if(arr[i]>smallest && arr[i]<secondSmallest)
			{
				secondSmallest = arr[i];
			}
		}
		
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {8,8,9,10};
		System.out.println(SecondSmallest(arr));
	}

}
