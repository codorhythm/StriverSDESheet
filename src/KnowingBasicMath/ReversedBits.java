package KnowingBasicMath;
import java.lang.*;
public class ReversedBits {
	static Long reversedBits(Long X) {
        // code here
        long ans = 0;
        int pv = 1;
        while(X!=0)
        {
            long rem = X%2;
            X = X/2;
            ans = ans + rem *  pv;
            pv = pv *10;
        }
        System.out.println(ans+" "+"ans");
        long revAns = 0;
        while(ans!=0)
        {
            long ld = ans%10;
            revAns = revAns * 10 + ld;
            ans/=10;
        } System.out.println(revAns);
        revAns*=1000000000000000000L;
        System.out.println(revAns+" "+"revAns");
        
        long finalAns = 0;
        int pv2 = 1;
        while(revAns!=0)
        {
            long ld = revAns%10;
            finalAns = finalAns + ld*pv2;
            pv2*=2;
            revAns/=10;
        }
        System.out.println("pv = "+pv);
        return finalAns;
        
       
    }

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		long X = 1;
		System.out.println(reversedBits(X));
	}

}
