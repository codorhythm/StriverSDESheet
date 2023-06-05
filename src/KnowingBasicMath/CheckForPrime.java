package KnowingBasicMath;

public class CheckForPrime {
	
	public static boolean checkPrime(int x)
	{
		int i = 2;
		while(i<x)
		{
			if(x%i == 0)
			{
				return false;
			}
			i++;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=25; i++)
		{
			System.out.println(i+" -> "+checkPrime(i));
		}
		
	}

}
