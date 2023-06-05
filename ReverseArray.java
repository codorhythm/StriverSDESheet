package LearningBasicRecurrsion;

public class ReverseArray {

	
	static void rev(int arr[], int start, int end)
	{
		if(start>=end)
		{
			return;
		}
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		rev(arr, start+=1, end-=1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		rev(arr,0,arr.length-1);
		System.out.println();
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		

	}

}
