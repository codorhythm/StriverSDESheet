//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        int x = n;
        for(int i = n; i >=1; i--)
        {
            for(int j = 0; j <n-x; j++)
            {
                System.out.print(" ");
            }
            
            for(int j = (2*i)-1; j >0; j--)
            {
                System.out.print("*");   
            }
            
            System.out.println(); x--;
        }
    }
}