package Sorting;

public class RecursiveBubbleSort {

	public static void recBubble(int arr[], int i, int j)
	{
		if(i<=0 || j>i-1)
		{
			return;
		}
		
		if(arr[j] > arr[j+1])
		{
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
					
		}
		
		recBubble(arr, i, j+=1);
		j = 0;
		recBubble(arr, i-=1, j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,41,13,12,1};
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
		
		recBubble(arr, arr.length-1, 0);
		System.out.println();
		
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
		

	}

}
