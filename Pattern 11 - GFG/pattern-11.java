//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int p = 1;
        for(int i = 1; i <=n; )
        {
            
            for(int j = 1; j <=i; j++)
            {
                System.out.print(p+" ");
                if(p == 0)
                {
                    p = 1;
                }
                else if(p == 1)
                {
                    p=0;
                }
                
                
            }
            i++;
            if(i%2==0)
            {
                p = 0;
            }
            else
            {
                p = 1;
            }
            
             System.out.println();
        }
    }
}