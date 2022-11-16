package BinarySearchProblems;

public class NumberInsortedArray {

	public static int number(int arr[])
	{
		int low = 0;
		int high = arr.length-2;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(arr[mid] == arr[mid^1])
			{
				low = mid+1;
			}
			else
			{
				high= mid-1;
			}
		}
		
		return arr[low];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,3,3,4};
		
		int ans = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			ans = ans ^ arr[i];
		}
		
		System.out.println(ans);
		System.out.println(number(arr));

	}

}
