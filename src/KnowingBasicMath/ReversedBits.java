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
 //ANY NUMBER THAT COMES AS A DECIMA NUMBER WE PERFORM AND AND CHCEK 
	    //WHETHER THE RIGHT MOST BIT IS 1 THAT MEANS 2 TO THE POWER STH IS THERE
	    // SO WE OR THAT TO RESULT AND WE BASICALLY KEEP RIGHT SHIFTING X
	   // AND LEFT SHIFTING RESULT --> HOW ? 1100 LEFT SHIFT 110 LEFT SHIFT 11 --> LEFT SHIFT 1 SO ON 
	    // AND RESULT 0 <-- RIGHT SHIFT 0 <-- RIGHT SHIFT UNTIL WE GET OPERATION OF AND AS 1 
        
       
    }

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		long X = 123;
		System.out.println(reversedBits(X));
	}

}
