package arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x = 0, x2= 0;
		int arr[] = {1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1}; 
		for(int i = 0; i <arr.length; i++)
		{
			if(arr[i] == 1)
			{
				x++;
				x2 = Math.max(x2, x);
			}
			else if(arr[i] == 0)
			{
				x = 0;
			}
		}
		
		System.out.println(x2);
	}

}
