package arrays;

public class LeftRoateArrayBy1 {

	public static void lefRotate(int arr[])
	{
		int temp = arr[0];
		for(int i = 1; i<arr.length; i++)
		{
			arr[i-1] = arr[i];
		}
		
		arr[arr.length-1] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		lefRotate(arr);
		System.out.println();
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		

	}

}
