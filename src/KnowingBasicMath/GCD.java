package KnowingBasicMath;

public class GCD {
	
	public static int gcd(int a, int b)
	{
		while(a>0 && b>0)
		{
			if(a>b)
			{
				a = a%b;
			}
			else
			{
				b = b%a;
			}
			
		}
		
		return (a==0)? b : a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(10, 20));
		
	}

}
