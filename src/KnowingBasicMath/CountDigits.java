package KnowingBasicMath;
import java.lang.*;
public class CountDigits {
	
static int numOfdigits(int x)
{
	return (int)(Math.log10(x)+1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(numOfdigits(12));

	}

}
