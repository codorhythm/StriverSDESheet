//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long reversedBits(Long X) {
        
        long result = 0;
    int bitsCount = 32;

    for (int i = 0; i < bitsCount; i++) {
        result <<= 1; // Left shift the result by 1 bit

        // Check if the current bit in X is set (equals 1)
        if ((X & 1) == 1) {
            result |= 1; // Set the rightmost bit of the result to 1
        }

        X >>= 1; // Right shift X by 1 bit
    }

    return result;
        // code here
        // long ans = 00000000000000000000000000000000;
        // int pv = 1;
        // while(X!=0)
        // {
        //     Long rem = X%2; System.out.println("rem "+rem);
        //     X = X/2;
        //     ans = ans + rem *  pv;System.out.println(ans);
        //     pv = pv *10;
        // }
        
        // long revAns = 0;
        // while(ans!=0)
        // {
        //     long ld = ans%10;
        //     revAns = revAns * 10 + ld;
        //     ans/=10;
        // }
        // revAns+=Math.pow(10,32);
        // long finalAns = 0;
        // int pv2 = 1;
        // while(revAns!=0)
        // {
        //     long ld = revAns%10;
        //     finalAns = finalAns + ld*pv2;
        //     pv2*=2;
        //     revAns/=10;
        // }
        
        // return finalAns;
        
        
    }
}