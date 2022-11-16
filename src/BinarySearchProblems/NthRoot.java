package BinarySearchProblems;

public class NthRoot {

	public static double multiply(double number, int n ) {
		double ans = 1.0;
		for(int i = 1; i <= n; i++)
		{
			ans = ans * number;
		}
		
		return ans;
	}
	
	public static double nthRoot(int m, int n)
	{
		double low = 1;
		double high = m;
		double eps = 1e-6;
		
		while((high - low) > eps)
		{
			double mid = (high +  low)/2.0;
			if(multiply(mid,n)>m)
			{
				high = mid;
			}
			else
			{
				low = mid;
			}
		}
		
		return low;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthRoot(27, 3));
	}

}
