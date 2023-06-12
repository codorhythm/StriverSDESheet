package Sorting;

public class RecursiveInsertionSort {
	public static void recInsertion(int arr[], int i, int j)
	{
		if(i>=arr.length-1 || j<0)
		{
			return;
			
		}
		
		if(arr[j] > arr[j+1])
		{
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		}
		
		j--;
		recInsertion(arr, i, j);
		i++;j = i;
		recInsertion(arr, i, j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,1};
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
		recInsertion(arr, 0, 0);
		System.out.println();
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
		

	}

}
