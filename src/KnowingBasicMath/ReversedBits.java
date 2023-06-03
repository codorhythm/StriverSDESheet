package KnowingBasicMath;
import java.lang.*;
public class ReversedBits {
	static Long reversedBits(Long X) {
		long result = 0;
	    int bitsCount = 32;

	    for (int i = 0; i < bitsCount; i++) {
	    	System.out.println("Left shift the result by 1 bit");
	        result <<= 1; // Left shift the result by 1 bit
	        System.out.println("i = "+i+" result "+ result);
	        System.out.println("X & 1 = "+ (X & 1));
	        if ((X & 1) == 1) {
	            result |= 1; // Set the rightmost bit of the result to 1
	            System.out.println("**Set the rightmost bit of the result to 1");
	            System.out.println(result);
	        }
	        
	        System.out.println("X = "+X);
	        X >>= 1; // Right shift X by 1 bit
	        System.out.println("Right shift X by 1 bit "+ X);
	    }

	    return result;
        // code here
//        long ans = 0;
//        int pv = 1;
//        while(X!=0)
//        {
//            long rem = X%2;
//            X = X/2;
//            ans = ans + rem *  pv;
//            pv = pv *10;
//        }
//        System.out.println(ans+" "+"ans");
//        long revAns = 0;
//        while(ans!=0)
//        {
//            long ld = ans%10;
//            revAns = revAns * 10 + ld;
//            ans/=10;
//        } System.out.println(revAns);
//        revAns*=1000000000000000000L;
//        System.out.println(revAns+" "+"revAns");
//        
//        long finalAns = 0;
//        int pv2 = 1;
//        while(revAns!=0)
//        {
//            long ld = revAns%10;
//            finalAns = finalAns + ld*pv2;
//            pv2*=2;
//            revAns/=10;
//        }
//        System.out.println("pv = "+pv);
//        return finalAns;
        
       
    }

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		long X = 12;
		System.out.println(reversedBits(X));
	}

}
